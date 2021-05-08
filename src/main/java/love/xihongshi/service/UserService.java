package love.xihongshi.service;

import love.xihongshi.bean.User;
import love.xihongshi.bean.UserExample;
import love.xihongshi.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-23 19:58 <br/>
 * @since JDK 1.8
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.selectByExample(null);
    }

    public void login(User user) {
        user.setUserFlag(1);
        userMapper.insertSelective(user);
    }

    public boolean existUserByWid(String openid) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andWidEqualTo(openid);
        long l = userMapper.countByExample(userExample);
        return l!=0?true:false;
    }

    public List<User> getUserByWid(String openid) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andWidEqualTo(openid);
        return userMapper.selectByExample(userExample);
    }

    public int addUserByWid(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andWidEqualTo(user.getWid());
        return userMapper.updateByExampleSelective(user,userExample);
    }

    public void updateUserByWid(String wid,User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andWidEqualTo(wid);
        userMapper.updateByExampleSelective(user,userExample);
    }
}
