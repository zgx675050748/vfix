package love.xihongshi.service;

import love.xihongshi.bean.Worker;
import love.xihongshi.bean.WorkerExample;
import love.xihongshi.dao.WorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-23 19:20 <br/>
 * @since JDK 1.8
 */

@Service
public class WorkerService {

    @Autowired
    private WorkerMapper workerMapper;

    public List<Worker> getAllWorker() {
        return workerMapper.selectByExampleWithUser(null);
    }

    public List<Worker> searchWorker(String key) {
        WorkerExample workerExample = new WorkerExample();
        WorkerExample.Criteria criteria = workerExample.createCriteria();
        criteria.andSkillLike("%"+key+"%");

        WorkerExample.Criteria criteria1 = workerExample.createCriteria();
        criteria1.andWnameLike("%"+key+"%");
        workerExample.or(criteria1);

        return workerMapper.selectByExampleWithUser(workerExample);
    }

    public void addWorker(Worker worker) {
        workerMapper.insertSelective(worker);
    }

    public List<Worker> getWorkerByUid(Long uid) {
        WorkerExample workerExample = new WorkerExample();
        WorkerExample.Criteria criteria = workerExample.createCriteria();
        criteria.andUidEqualTo(uid);
        return workerMapper.selectByExample(workerExample);
    }

    public void updateWorker(Worker worker) {
        workerMapper.updateByPrimaryKeySelective(worker);
    }

    public Worker getWorkerByWid(Long wid) {
        return workerMapper.selectByPrimaryKey(wid);
    }
}
