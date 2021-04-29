package love.xihongshi.controller;

import love.xihongshi.bean.Msg;
import love.xihongshi.bean.Worker;
import love.xihongshi.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @ResponseBody
    @RequestMapping("/worker")
    public Msg getAllWorker(){
        List<Worker> workerList = workerService.getAllWorker();
        return Msg.success().add("worker",workerList);
    }
}
