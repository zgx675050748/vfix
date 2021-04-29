package love.xihongshi.dao;

import java.util.List;

import love.xihongshi.bean.Demand;
import love.xihongshi.bean.DemandExample;
import org.apache.ibatis.annotations.Param;

public interface DemandMapper {
    long countByExample(DemandExample example);

    int deleteByExample(DemandExample example);

    int deleteByPrimaryKey(Long did);

    int insert(Demand record);

    int insertSelective(Demand record);

    List<Demand> selectByExampleWithBLOBs(DemandExample example);

    List<Demand> selectByExample(DemandExample example);

    Demand selectByPrimaryKey(Long did);

    List<Demand> selectByExampleWithBLOBsWithUser(DemandExample example);

    List<Demand> selectByExampleWithUser(DemandExample example);

    Demand selectByPrimaryKeyWithUser(Long did);

    int updateByExampleSelective(@Param("record") Demand record, @Param("example") DemandExample example);

    int updateByExampleWithBLOBs(@Param("record") Demand record, @Param("example") DemandExample example);

    int updateByExample(@Param("record") Demand record, @Param("example") DemandExample example);

    int updateByPrimaryKeySelective(Demand record);

    int updateByPrimaryKeyWithBLOBs(Demand record);

    int updateByPrimaryKey(Demand record);
}