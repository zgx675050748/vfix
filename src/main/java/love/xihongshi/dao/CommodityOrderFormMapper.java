package love.xihongshi.dao;

import java.util.List;
import love.xihongshi.bean.CommodityOrderForm;
import love.xihongshi.bean.CommodityOrderFormExample;
import love.xihongshi.bean.SearchCommodityOrderForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CommodityOrderFormMapper {
    long countByExample(CommodityOrderFormExample example);

    int deleteByExample(CommodityOrderFormExample example);

    int deleteByPrimaryKey(Long ofid);

    int insert(CommodityOrderForm record);

    int insertSelective(CommodityOrderForm record);

    List<CommodityOrderForm> selectByExample(CommodityOrderFormExample example);

    CommodityOrderForm selectByPrimaryKey(Long ofid);

    List<CommodityOrderForm> selectByExampleWithCommodityAndUser(CommodityOrderFormExample example);

    CommodityOrderForm selectByPrimaryKeyWithCommodityAndUser(Long ofid);

    List<CommodityOrderForm> selectByUidWithCommodityAndUser(Long uid);

    List<CommodityOrderForm> selectByMerchantWithCommodityOFAndCommodityMin(Long uid);

    List<CommodityOrderForm> selectByCidWithCommentAndUser(Long cid);

    List<CommodityOrderForm> searchWithCommodityAndUser(SearchCommodityOrderForm searchCommodityOrderForm);

    int updateByExampleSelective(@Param("record") CommodityOrderForm record, @Param("example") CommodityOrderFormExample example);

    int updateByExample(@Param("record") CommodityOrderForm record, @Param("example") CommodityOrderFormExample example);

    int updateByPrimaryKeySelective(CommodityOrderForm record);

    int updateByPrimaryKey(CommodityOrderForm record);
}