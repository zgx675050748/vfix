package love.xihongshi.service;

import love.xihongshi.bean.CommodityOrderForm;
import love.xihongshi.bean.CommodityOrderFormExample;
import love.xihongshi.bean.SearchCommodityOrderForm;
import love.xihongshi.dao.CommodityOrderFormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-05-11 21:52 <br/>
 * @since JDK 1.8
 */
@Service
public class CommodityOrderFormService {
    @Autowired
    CommodityOrderFormMapper commodityOrderFormMapper;

    public void addCommodityOF(CommodityOrderForm commodityOrderForm) {
        commodityOrderFormMapper.insertSelective(commodityOrderForm);
    }

    public List<CommodityOrderForm> getCommodityOFByUid(Long uid) {
        return commodityOrderFormMapper.selectByUidWithCommodityAndUser(uid);
    }

    public List<CommodityOrderForm> searchByUid(Long uid, String str) {
        SearchCommodityOrderForm searchCommodityOrderForm =
                new SearchCommodityOrderForm(uid,str,str,str);
        return commodityOrderFormMapper.searchWithCommodityAndUser(searchCommodityOrderForm);
    }

    public CommodityOrderForm getCommodityOFByOfid(Long ofid) {
        return commodityOrderFormMapper.selectByPrimaryKeyWithCommodityAndUser(ofid);
    }

    public List<CommodityOrderForm> getCommodityOFByMerchant(Long uid) {
        return commodityOrderFormMapper.selectByMerchantWithCommodityOFAndCommodityMin(uid);
    }

    public void updateCommodityOrderForm(CommodityOrderForm commodityOrderForm) {
        commodityOrderFormMapper.updateByPrimaryKeySelective(commodityOrderForm);
    }

    public List<CommodityOrderForm> getCommentAndUserByCid(Long cid) {
        return commodityOrderFormMapper.selectByCidWithCommentAndUser(cid);
    }

    public Long getCountByUidAndCid(Long uid, Long cid) {
        CommodityOrderFormExample commodityOrderFormExample =
                new CommodityOrderFormExample();
        CommodityOrderFormExample.Criteria criteria = commodityOrderFormExample.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andCidEqualTo(cid);
        return  commodityOrderFormMapper.countByExample(commodityOrderFormExample);
    }

    public void delCommodityOFByOfid(Long ofid) {
        commodityOrderFormMapper.deleteByPrimaryKey(ofid);
    }
}
