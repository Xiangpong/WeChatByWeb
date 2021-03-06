package com.pong.WeChatByWeb.Service;

import com.pong.WeChatByWeb.Pojo.Log;

import java.util.List;

public interface ILogService {
    List<Log> selectAll(int page, int pageSize);
    List<Log> selectLogByUserid(String userid, int page, int pageSize);
    int selectCount(int pageSize);
    int selectCountByUserid(String userid, int pageSize);
    boolean insert(Log log);
    boolean delete(String id);
    boolean deleteThisUser(String userid);
    boolean deleteAll();

}
