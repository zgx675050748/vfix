package love.xihongshi.controller;

import love.xihongshi.bean.Commodity;
import love.xihongshi.bean.Msg;
import love.xihongshi.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/searchCommodity")
    @ResponseBody
    public Msg searchCommodity(String key){
        List<Commodity> commodityList = commodityService.searchCommodity(key);
        return Msg.success().add("commodity",commodityList);
    }

    @RequestMapping("/commodity")
    @ResponseBody
    public Msg getAllCommodity(){
        List<Commodity> commodityList = commodityService.getAllCommodity();
        return Msg.success().add("commodity",commodityList);
    }
}
