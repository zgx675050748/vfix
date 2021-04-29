package love.xihongshi.service;

import love.xihongshi.bean.Merchant;
import love.xihongshi.dao.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-23 20:04 <br/>
 * @since JDK 1.8
 */
@Service
public class MerchantService {

    @Autowired
    private MerchantMapper merchantMapper;

    public List<Merchant> getAllMerchant() {
        return merchantMapper.selectByExampleWithUser(null);
    }
}
