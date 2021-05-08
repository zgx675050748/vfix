package love.xihongshi.dao;

import java.util.List;
import love.xihongshi.bean.WorkerComment;
import love.xihongshi.bean.WorkerCommentExample;
import org.apache.ibatis.annotations.Param;

public interface WorkerCommentMapper {
    long countByExample(WorkerCommentExample example);

    int deleteByExample(WorkerCommentExample example);

    int deleteByPrimaryKey(Long wcid);

    int insert(WorkerComment record);

    int insertSelective(WorkerComment record);

    List<WorkerComment> selectByExample(WorkerCommentExample example);

    WorkerComment selectByPrimaryKey(Long wcid);

    int updateByExampleSelective(@Param("record") WorkerComment record, @Param("example") WorkerCommentExample example);

    int updateByExample(@Param("record") WorkerComment record, @Param("example") WorkerCommentExample example);

    int updateByPrimaryKeySelective(WorkerComment record);

    int updateByPrimaryKey(WorkerComment record);
}