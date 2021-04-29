package love.xihongshi.service;

import love.xihongshi.bean.Worker;
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
}
