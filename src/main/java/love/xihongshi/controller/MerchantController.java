package love.xihongshi.controller;

import love.xihongshi.bean.Merchant;
import love.xihongshi.bean.Msg;
import love.xihongshi.bean.User;
import love.xihongshi.service.MerchantService;
import love.xihongshi.service.UserService;
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
    @Autowired
    private UserService userService;

    @RequestMapping("/merchantByMid")
    @ResponseBody
    public Msg getMerchantByMid(Long mid){
        Merchant merchant = merchantService.getMerchantByMid(mid);
        return Msg.success().add("merchant",merchant);
    }

    @RequestMapping("/addMerchant")
    @ResponseBody
    public Msg addMerchant(Merchant merchant,String wid){
        List<User> userList = userService.getUserByWid(wid);
        User user = new User();
        user.setMerchantFlag(1);
        userService.updateUserByWid(wid,user);
        merchant.setUid(userList.get(0).getUid());
        merchantService.addMerchant(merchant);
        return Msg.success();
    }

    @RequestMapping("/merchant")
    @ResponseBody
    public Msg getAllMerchant(){
        List<Merchant> merchantList = merchantService.getAllMerchant();
        return Msg.success().add("merchant",merchantList);
    }
}
