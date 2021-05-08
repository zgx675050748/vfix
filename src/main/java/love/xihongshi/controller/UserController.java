package love.xihongshi.controller;

import com.alibaba.fastjson.JSONObject;
import love.xihongshi.bean.Msg;
import love.xihongshi.bean.User;
import love.xihongshi.bean.WxMinProgram;
import love.xihongshi.service.UserService;
import love.xihongshi.util.GetOpenIdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-23 19:57 <br/>
 * @since JDK 1.8
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private WxMinProgram wxMinProgram;

    @RequestMapping("/my")
    @ResponseBody
    public Msg myInfo(String wid){
        List<User> userByWid = userService.getUserByWid(wid);
        return Msg.success().add("userInfo",userByWid.get(0));
    }

    @RequestMapping("/setUserInfo")
    @ResponseBody
    public Msg setUserInfo(User user){
        int i = userService.addUserByWid(user);
        if (i != 0){
            return Msg.success();
        }
        return Msg.fail();
    }


    //将小程序发来的code和appID与appSecret联合获取openid和session_key，并存储
    @RequestMapping(value = "/login")
    @ResponseBody
    public Msg login(String code, HttpServletRequest request,
                     HttpServletResponse response, HttpSession session) throws IOException {
        // TODO Auto-generated method stub  GetOpenId

        response.setContentType("text/html;charset=utf-8");
        /*设置响应头允许ajax跨域访问*/
        response.setHeader("Access-Control-Allow-Origin", "*");

        /* 星号表示所有的异域请求都可以接受， */
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");

        //参数
        String appid = wxMinProgram.getAppId();//自己找自己的
        // 记得发给别人前删掉这个
        String secret = wxMinProgram.getAppSecret();//自己找自己的
        // 调用方位微信服务器工具方法
        GetOpenIdUtil getopenid=new GetOpenIdUtil();
        //调用访问微信服务器工具方法，传入三个参数获取带有openid、session_key的json字符串
        String jsonId=getopenid.getopenid(appid,code,secret);
        JSONObject jsonObject = JSONObject.parseObject(jsonId);
        //从json字符串获取openid和session_key
        String openid=jsonObject.getString("openid");
        String session_key=jsonObject.getString("session_key");
        //封装User
        User user = new User();
        user.setWid(openid);
        if (!userService.existUserByWid(openid)){
            userService.login(user);
            System.out.println("首次登录");
        }
        session.setAttribute("session_key",session_key);
        List<User> userByWid = userService.getUserByWid(openid);
        return Msg.success().add("openid",openid).add("session_key",
                session_key).add("uid",userByWid.get(0).getUid());
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseBody
    public Msg getAllUser(){
        List<User> userList = userService.getAllUser();
        return Msg.success().add("user",userList);
    }
}
