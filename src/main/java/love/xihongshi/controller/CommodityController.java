package love.xihongshi.controller;

import com.fasterxml.jackson.databind.node.LongNode;
import love.xihongshi.bean.Commodity;
import love.xihongshi.bean.Merchant;
import love.xihongshi.bean.Msg;
import love.xihongshi.bean.User;
import love.xihongshi.service.CommodityService;
import love.xihongshi.service.MerchantService;
import love.xihongshi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-23 21:53 <br/>
 * @since JDK 1.8
 */
@Controller
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @Autowired
    private MerchantService merchantService;

    @RequestMapping("/addCommodity")
    @ResponseBody
    public Msg addCommodity(Commodity commodity, Long uid){
        List<Merchant> merchantList = merchantService.getMerchantByUid(uid);
        commodity.setMid(merchantList.get(0).getMid());
        commodity.setReleasedate(new Date());
        commodity.setSalesamount(0L);
        commodityService.addCommodity(commodity);
        return Msg.success();
    }

    @RequestMapping("/changeCommodityByCid")
    @ResponseBody
    public Msg changeCommodityByCid(Commodity commodity){
        System.out.println(commodity);
        commodityService.updateCommodityByCid(commodity);
        return Msg.success();
    }

    @RequestMapping("/commodityByCidWithFull")
    @ResponseBody
    public Msg getCommodityByCidWithFull(Long cid){
        Commodity commodity = commodityService.getCommodityByCidWithFull(cid);
        return Msg.success().add("commodity",commodity);
    }

    @RequestMapping("/searchCommodity")
    @ResponseBody
    public Msg searchCommodity(String key){
        List<Commodity> commodityList = commodityService.searchCommodity(key);
        return Msg.success().add("commodity",commodityList);
    }

    @RequestMapping("/commodityByUid")
    @ResponseBody
    public Msg getCommodityByUid(Long uid){
        List<Merchant> merchantList = merchantService.getMerchantByUid(uid);
        List<Commodity> commodityList =
                commodityService.getCommodityByUid(merchantList.get(0).getMid());
        return Msg.success().add("commoditys",commodityList);
    }

    @RequestMapping("/commodity")
    @ResponseBody
    public Msg getAllCommodity(){
        List<Commodity> commodityList = commodityService.getAllCommodity();
        return Msg.success().add("commodity",commodityList);
    }
}
