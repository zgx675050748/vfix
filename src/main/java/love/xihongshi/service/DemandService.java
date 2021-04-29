package love.xihongshi.service;

import love.xihongshi.bean.Demand;
import love.xihongshi.dao.DemandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-25 11:25 <br/>
 * @since JDK 1.8
 */

@Service
public class DemandService {
    @Autowired
    private DemandMapper demandMapper;
    public List<Demand> getAllDemand() {
        return demandMapper.selectByExampleWithUser(null);
    }

    public List<Demand> getAllDemandFull() {
        return demandMapper.selectByExampleWithBLOBsWithUser(null);
    }

    public void addDemand(Demand demand) {
        demandMapper.insertSelective(demand);
    }

    public Demand getDemandByDid(Long did) {
        return demandMapper.selectByPrimaryKeyWithUser(did);
    }
}
