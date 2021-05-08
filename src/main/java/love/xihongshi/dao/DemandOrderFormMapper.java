package love.xihongshi.dao;

import java.util.List;
import love.xihongshi.bean.DemandOrderForm;
import love.xihongshi.bean.DemandOrderFormExample;
import org.apache.ibatis.annotations.Param;

public interface DemandOrderFormMapper {
    long countByExample(DemandOrderFormExample example);

    int deleteByExample(DemandOrderFormExample example);

    int deleteByPrimaryKey(Long ofid);

    int insert(DemandOrderForm record);

    int insertSelective(DemandOrderForm record);

    List<DemandOrderForm> selectByExample(DemandOrderFormExample example);

    DemandOrderForm selectByPrimaryKey(Long ofid);

    int updateByExampleSelective(@Param("record") DemandOrderForm record, @Param("example") DemandOrderFormExample example);

    int updateByExample(@Param("record") DemandOrderForm record, @Param("example") DemandOrderFormExample example);

    int updateByPrimaryKeySelective(DemandOrderForm record);

    int updateByPrimaryKey(DemandOrderForm record);
}