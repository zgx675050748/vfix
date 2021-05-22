package love.xihongshi.dao;

import java.util.List;
import love.xihongshi.bean.CommodityComment;
import love.xihongshi.bean.CommodityCommentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CommodityCommentMapper {
    long countByExample(CommodityCommentExample example);

    int deleteByExample(CommodityCommentExample example);

    int deleteByPrimaryKey(Long ccid);

    int insert(CommodityComment record);

    int insertSelective(CommodityComment record);

    List<CommodityComment> selectByExample(CommodityCommentExample example);

    CommodityComment selectByPrimaryKey(Long ccid);

    int updateByExampleSelective(@Param("record") CommodityComment record, @Param("example") CommodityCommentExample example);

    int updateByExample(@Param("record") CommodityComment record, @Param("example") CommodityCommentExample example);

    int updateByPrimaryKeySelective(CommodityComment record);

    int updateByPrimaryKey(CommodityComment record);
}