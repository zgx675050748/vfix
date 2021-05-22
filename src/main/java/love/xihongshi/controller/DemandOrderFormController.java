package love.xihongshi.controller;

import love.xihongshi.bean.DemandOrderForm;
import love.xihongshi.bean.Msg;
import love.xihongshi.bean.Worker;
import love.xihongshi.service.DemandOrderFormService;
import love.xihongshi.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-05-21 15:54 <br/>
 * @since JDK 1.8
 */
@Controller
public class DemandOrderFormController {

    @Autowired
    WorkerService workerService;

    @Autowired
    DemandOrderFormService demandOrderFormService;

    @RequestMapping("/addDemandOrderFormComment")
    @ResponseBody
    public Msg addDemandOrderFormComment(DemandOrderForm demandOrderForm){
        demandOrderFormService.addDemandOrderFormComment(demandOrderForm);
        return Msg.success();
    }

    @RequestMapping("/demandOrderFormCommentsByUid")
    @ResponseBody
    public Msg getDemandOrederFormCommentsByUid(Long uid){
        List<Worker> workerByUid = workerService.getWorkerByUid(uid);
        List<DemandOrderForm> demandOrderFormList =
                demandOrderFormService.getDemandOrederFormCommentsByWid(workerByUid.get(0).getWid());
        return Msg.success().add("comments",demandOrderFormList);
    }

    @RequestMapping("/demandOrderFormCommentsByWid")
    @ResponseBody
    public Msg getDemandOrederFormCommentsByWid(Long wid){
        List<DemandOrderForm> demandOrderFormList =
                demandOrderFormService.getDemandOrederFormCommentsByWid(wid);
        return Msg.success().add("comments",demandOrderFormList);
    }

    @RequestMapping("/demandOrderFormCommentByOfid")
    @ResponseBody
    public Msg getDemandOrderFormCommentByOfid(Long ofid){
        DemandOrderForm demandOrderForm =
                demandOrderFormService.getDemandOrderFormCommentByOfid(ofid);
        return Msg.success().add("commentFlag",demandOrderForm);
    }

    @RequestMapping("/addDemandOF")
    @ResponseBody
    public Msg addDemandOF(DemandOrderForm demandOrderForm,Long uid){
        List<Worker> workerList = workerService.getWorkerByUid(uid);
        demandOrderForm.setWid(workerList.get(0).getWid());
        Long count =
                demandOrderFormService.getCountByDidAndWid(demandOrderForm.getDid(),
                demandOrderForm.getWid());
        if(count > 0){
            return Msg.fail().add("msg","请勿重复投递");
        }
        else {
            demandOrderForm.setReleasedate(new Date());
            demandOrderForm.setStatus("1");
            demandOrderFormService.addDemandOF(demandOrderForm);
            return Msg.success();
        }
    }

    @RequestMapping("/getDemandOFWokerMinByDid")
    @ResponseBody
    public Msg getDemandOFWokerMinByDid(Long did){
        List<DemandOrderForm> demandOrderFormList =
                demandOrderFormService.getDemandOFWokerMinByDid(did);
        return Msg.success().add("demandOrderForms",demandOrderFormList);
    }

    @RequestMapping("/getDemandOFWokerByDid")
    @ResponseBody
    public Msg getDemandOFWokerByDid(Long did){
        List<DemandOrderForm> demandOrderFormList =
                demandOrderFormService.getDemandOFWokerByDid(did);
        return Msg.success().add("demandOrderForms",demandOrderFormList);
    }

    @RequestMapping("/getDemandOFDemandByUid")
    @ResponseBody
    public Msg getDemandOFDemandByUid(Long uid){
        List<Worker> workerList = workerService.getWorkerByUid(uid);
        List<DemandOrderForm> demandOrderFormList =
                demandOrderFormService.getDemandOFDemandBywid(workerList.get(0).getWid());
        System.out.println(demandOrderFormList);
        return Msg.success().add("demandOrderForms",demandOrderFormList);
    }
}
