package love.xihongshi.service;

import love.xihongshi.bean.DemandOrderForm;
import love.xihongshi.bean.DemandOrderFormExample;
import love.xihongshi.dao.DemandOrderFormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-05-21 16:00 <br/>
 * @since JDK 1.8
 *
 */
@Service
public class DemandOrderFormService {
    @Autowired
    DemandOrderFormMapper demandOrderFormMapper;

    public void addDemandOF(DemandOrderForm demandOrderForm) {
        demandOrderFormMapper.insertSelective(demandOrderForm);
    }

    public List<DemandOrderForm> getDemandOFWokerMinByDid(Long did) {
        return demandOrderFormMapper.selectByDidWithWorkerMin(did);
    }

    public Long getCountByDidAndWid(Long did, Long wid) {
        DemandOrderFormExample demandOrderFormExample =
                new DemandOrderFormExample();
        DemandOrderFormExample.Criteria criteria = demandOrderFormExample.createCriteria();
        criteria.andDidEqualTo(did);
        criteria.andWidEqualTo(wid);
        return demandOrderFormMapper.countByExample(demandOrderFormExample);
    }

    public List<DemandOrderForm> getDemandOFWokerByDid(Long did) {
        return demandOrderFormMapper.selectByDidWithWorker(did);
    }

    public void updateDemandOrderFormByDid(Long did,DemandOrderForm demandOrderForm) {
        DemandOrderFormExample demandOrderFormExample =
                new DemandOrderFormExample();
        DemandOrderFormExample.Criteria criteria = demandOrderFormExample.createCriteria();
        criteria.andDidEqualTo(did);
        demandOrderFormMapper.updateByExampleSelective(demandOrderForm,
                demandOrderFormExample);
    }

    public List<DemandOrderForm> getDemandOFDemandBywid(Long wid) {
        return demandOrderFormMapper.selectByWidWithDemandMin(wid);
    }

    public DemandOrderForm getDemandOrderFormCommentByOfid(Long ofid) {
        return demandOrderFormMapper.selectByPrimaryKey(ofid);
    }

    public List<DemandOrderForm> getDemandOrederFormCommentsByWid(Long wid) {
        DemandOrderFormExample demandOrderFormExample =
                new DemandOrderFormExample();
        DemandOrderFormExample.Criteria criteria = demandOrderFormExample.createCriteria();
        criteria.andWidEqualTo(wid);
        return demandOrderFormMapper.selectByExample(demandOrderFormExample);
    }

    public void addDemandOrderFormComment(DemandOrderForm demandOrderForm) {
        demandOrderFormMapper.updateByPrimaryKeySelective(demandOrderForm);
    }
}
