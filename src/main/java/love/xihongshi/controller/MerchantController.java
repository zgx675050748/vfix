package love.xihongshi.controller;

import love.xihongshi.bean.Merchant;
import love.xihongshi.bean.Msg;
import love.xihongshi.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-23 20:02 <br/>
 * @since JDK 1.8
 */
@Controller
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @RequestMapping("/merchant")
    @ResponseBody
    public Msg getAllMerchant(){
        List<Merchant> merchantList = merchantService.getAllMerchant();
        return Msg.success().add("merchant",merchantList);
    }
}
