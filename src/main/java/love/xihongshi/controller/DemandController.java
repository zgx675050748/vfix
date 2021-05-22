package love.xihongshi.controller;

import love.xihongshi.bean.Demand;
import love.xihongshi.bean.DemandOrderForm;
import love.xihongshi.bean.Msg;
import love.xihongshi.bean.User;
import love.xihongshi.service.DemandOrderFormService;
import love.xihongshi.service.DemandService;
import love.xihongshi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-25 11:25 <br/>
 * @since JDK 1.8
 */
@Controller
public class DemandController {
    @Autowired
    private DemandService demandService;
    @Autowired
    private UserService userService;
    @Autowired
    private DemandOrderFormService demandOrderFormService;

    @RequestMapping("/underDemand")
    @ResponseBody
    public Msg underDemand(Demand demand){
        demandService.updateDemandByDid(demand);
        DemandOrderForm demandOrderForm = new DemandOrderForm();
        demandOrderForm.setStatus("0");
        demandOrderFormService.updateDemandOrderFormByDid(demand.getDid(),demandOrderForm);
        return Msg.success();
    }

    @RequestMapping("/searchDemand")
    @ResponseBody
    public Msg searchDemand(String key){
        List<Demand> demandList = demandService.searchDemand(key);
        return Msg.success().add("demand",demandList);
    }

    @RequestMapping("/demandFullbyDid")
    @ResponseBody
    public Msg getDemandFullByDid(Long did){
        Demand demand = demandService.getDemandByDid(did);
        return Msg.success().add("demand",demand);
    }

    @RequestMapping("/demandFullbyUid")
    @ResponseBody
    public Msg getDemandFullbyUid(Long uid){
        List<Demand> demandList = demandService.getDemandByUid(uid);
        return Msg.success().add("demands",demandList);
    }

    @RequestMapping("/addDemand")
    @ResponseBody
    public Msg addDemand(Demand demand,@RequestParam("wid") String wid){
        System.out.println("开始提交");
        List<User> userList = userService.getUserByWid(wid);
        demand.setUid(userList.get(0).getUid());
        demandService.addDemand(demand);
        return Msg.success();
    }

    @RequestMapping("/demandFull")
    @ResponseBody
    public Msg getAllDemandFull(){
        List<Demand> demandList = demandService.getAllDemandFull();
        for (Demand demand : demandList) {
            System.out.println(demand);
        }
        return Msg.success().add("demand",demandList);
    }


    @RequestMapping("/demand")
    @ResponseBody
    public Msg getAllDemand(){
        List<Demand> demandList = demandService.getAllDemand();
        return Msg.success().add("demand",demandList);
    }
}
