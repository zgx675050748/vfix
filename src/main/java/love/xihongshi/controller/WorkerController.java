package love.xihongshi.controller;

import love.xihongshi.bean.Msg;
import love.xihongshi.bean.User;
import love.xihongshi.bean.Worker;
import love.xihongshi.service.UserService;
import love.xihongshi.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-23 19:18 <br/>
 * @since JDK 1.8
 */

@Controller
public class WorkerController {

    @Autowired
    private WorkerService workerService;
    @Autowired
    private UserService userService;


    @RequestMapping("/workerByWid")
    @ResponseBody
    public Msg getWorkerByWid(Long wid){
        Worker worker = workerService.getWorkerByWid(wid);
        return Msg.success().add("worker",worker);
    }

    @RequestMapping("/editWorker")
    @ResponseBody
    public Msg updateWorker(Worker worker){
        workerService.updateWorker(worker);
        return Msg.success();
    }

    @RequestMapping("/workerByUid")
    @ResponseBody
    public Msg getWorkerByUid(Long uid){
        List<Worker> workerList =
                workerService.getWorkerByUid(uid);
        return Msg.success().add("worker",workerList.get(0));
    }

    @RequestMapping("/addWorker")
    @ResponseBody
    public Msg addWorker(Worker worker,@RequestParam(value = "wxid") String wid){
        User user = new User();
        user.setWorkerFlag(1);
        userService.updateUserByWid(wid,user);
        workerService.addWorker(worker);
        return Msg.success();
    }

    @RequestMapping("/searchWorker")
    @ResponseBody
    public Msg searchWorker(String key){
        List<Worker> workerList = workerService.searchWorker(key);
        return Msg.success().add("worker",workerList);
    }

    @ResponseBody
    @RequestMapping("/worker")
    public Msg getAllWorker(){
        List<Worker> workerList = workerService.getAllWorker();
        return Msg.success().add("worker",workerList);
    }
}
