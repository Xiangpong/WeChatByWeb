package com.pong.WeChatByWeb.Service;


import com.pong.WeChatByWeb.Pojo.User;
import java.util.List;

/**
 * Author :  吴湘鹏
 * TODO   :
 */
public interface IUserService {
    List<User> selectAll(int page, int pageSize);
    User selectUserByUserid(String userid);
    int selectCount(int pageSize);
    boolean insert(User user);
    boolean update(User user);
    boolean delete(String userid);
}
