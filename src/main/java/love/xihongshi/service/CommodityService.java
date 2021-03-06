package love.xihongshi.service;

import love.xihongshi.bean.Commodity;
import love.xihongshi.bean.CommodityExample;
import love.xihongshi.dao.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-23 21:58 <br/>
 * @since JDK 1.8
 */
@Service
public class CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;
    public List<Commodity> getAllCommodity() {
        return commodityMapper.selectByExampleWithMerchant(null);
    }

    public List<Commodity> searchCommodity(String key) {
        CommodityExample commodityExample = new CommodityExample();

        CommodityExample.Criteria criteria0 = commodityExample.createCriteria();
        criteria0.andCnameLike("%"+key+"%");

        CommodityExample.Criteria criteria1 = commodityExample.createCriteria();
        criteria1.andCintroduceLike("%"+key+"%");
        commodityExample.or(criteria1);

        CommodityExample.Criteria criteria2 = commodityExample.createCriteria();
        criteria2.andTypeLike("%"+key+"%");
        commodityExample.or(criteria2);

        return commodityMapper.selectByExampleWithMerchant(commodityExample);
    }

    public List<Commodity> getCommodityByUid(Long mid) {
        CommodityExample commodityExample = new CommodityExample();
        CommodityExample.Criteria criteria = commodityExample.createCriteria();
        criteria.andMidEqualTo(mid);
        return commodityMapper.selectByExample(commodityExample);
    }

    public Commodity getCommodityByCidWithFull(Long cid) {
        return commodityMapper.selectByPrimaryKey(cid);
    }

    public int updateCommodityByCid(Commodity commodity) {
        return commodityMapper.updateByPrimaryKeySelective(commodity);
    }

    public void addCommodity(Commodity commodity) {
        commodityMapper.insertSelective(commodity);
    }

    public List<Commodity> getCommodityByCid(Long cid) {
        CommodityExample commodityExample = new CommodityExample();
        CommodityExample.Criteria criteria = commodityExample.createCriteria();
        criteria.andCidEqualTo(cid);
        return commodityMapper.selectByExample(commodityExample);
    }
}
