package com.pong.WeChatByWeb.Service.Impl;

import com.pong.WeChatByWeb.Dao.IUserDao;
import com.pong.WeChatByWeb.Pojo.User;
import com.pong.WeChatByWeb.Service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author :  吴湘鹏
 * TODO   :
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Resource private IUserDao userDao;

    @Override
    public List<User> selectAll(int page, int pageSize) {
        return userDao.selectAll(page, pageSize);
    }

    @Override
    public User selectUserByUserid(String userid) {
        return userDao.selectUserByUserid(userid);
    }

    @Override
    public int selectCount(int pageSize) {
        int pageCount = Integer.parseInt(userDao.selectCount().getUserid());
        return pageCount % pageSize == 0 ? pageCount/pageSize : pageCount/pageSize + 1;
    }

    @Override
    public boolean insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public boolean delete(String userid) {
        return userDao.delete(userid);
    }
}
