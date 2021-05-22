package love.xihongshi.controller;

import love.xihongshi.bean.Commodity;
import love.xihongshi.bean.CommodityOrderForm;
import love.xihongshi.bean.Msg;
import love.xihongshi.service.CommodityOrderFormService;
import love.xihongshi.service.CommodityService;
import love.xihongshi.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-05-11 21:27 <br/>
 * @since JDK 1.8
 */
@Controller
public class CommodityOrderFormController {
    @Autowired
    CommodityOrderFormService commodityOrderFormService;

    @Autowired
    CommodityService commodityService;

    @Autowired
    MerchantService merchantService;

    @RequestMapping("/commentAndUserByCid")
    @ResponseBody
    public Msg getCommentAndUserByCid(Long cid){
        List<CommodityOrderForm> commodityOrderFormList =
                commodityOrderFormService.getCommentAndUserByCid(cid);
        return Msg.success().add("comments",commodityOrderFormList);
    }

    @RequestMapping("/addComment")
    @ResponseBody
    public Msg addComment(CommodityOrderForm commodityOrderForm){
        System.out.println(commodityOrderForm);
        commodityOrderFormService.updateCommodityOrderForm(commodityOrderForm);
        return Msg.success();
    }

    @RequestMapping("/getCommmodityOFByMerchant")
    @ResponseBody
    public Msg getCommmodityOFByMerchant(Long uid){
        //多表查询，通过uid查出merchant、commodity、commodityOrderForm
        List<CommodityOrderForm> commodityOrderFormList =
                commodityOrderFormService.getCommodityOFByMerchant(uid);
        return Msg.success().add("commodityOrderForms",commodityOrderFormList);
    }

    @RequestMapping("/addCommodityOF")
    @ResponseBody
    public Msg addCommodityOF(CommodityOrderForm commodityOrderForm){
        List<Commodity> commodityList =
                commodityService.getCommodityByCid(commodityOrderForm.getCid());
        Long amount = commodityList.get(0).getAmount();
        Long salesamount = commodityList.get(0).getSalesamount();
        if (amount < commodityOrderForm.getCount()){
            return Msg.fail().add("msg","库存不足");
        }
        else {
            Commodity commodity = commodityList.get(0);
            commodity.setSalesamount(salesamount + commodityOrderForm.getCount());
            commodity.setAmount(amount - commodityOrderForm.getCount());
            commodityService.updateCommodityByCid(commodity);
            commodityOrderForm.setReleasedate(new Date());
            commodityOrderFormService.addCommodityOF(commodityOrderForm);
            return Msg.success();
        }
    }

    @RequestMapping("/getCommodityOFByUid")
    @ResponseBody
    public Msg getCommodityOFByUid(Long uid){
        List<CommodityOrderForm> commodityOrderFormList =
                commodityOrderFormService.getCommodityOFByUid(uid);
        return Msg.success().add("commodityOFs",commodityOrderFormList);
    }

    @RequestMapping("/getCommodityOFByOfid")
    @ResponseBody
    public Msg getCommodityOFByOfid(Long ofid){
        CommodityOrderForm commodityOrderForm =
                commodityOrderFormService.getCommodityOFByOfid(ofid);
        return Msg.success().add("commodityOrderForm",commodityOrderForm);
    }

    @RequestMapping("/searchByUid")
    @ResponseBody
    public Msg searchByUid(Long uid,String key){
        List<CommodityOrderForm> commodityOrderFormList =
                commodityOrderFormService.searchByUid(uid,key);
        return Msg.success().add("commodityOFs",commodityOrderFormList);
    }
}
