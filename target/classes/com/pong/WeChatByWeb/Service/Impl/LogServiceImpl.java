package com.pong.WeChatByWeb.Service.Impl;

import com.pong.WeChatByWeb.Dao.ILogDao;
import com.pong.WeChatByWeb.Pojo.Log;
import com.pong.WeChatByWeb.Service.ILogService;
import com.pong.WeChatByWeb.Utils.StringUtil;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class LogServiceImpl implements ILogService {

    @Resource private ILogDao logDao;
    @Resource private Log log;



    @Override
    public List<Log> selectAll(int page, int pageSize) {
        return logDao.selectAll(page, pageSize);
    }

    @Override
    public List<Log> selectLogByUserid(String userid, int page, int pageSize) {
        int start = 1;
        int end = pageSize;
        if(page != 1) {
            start = pageSize * (page - 1) + 1;
            end = pageSize * page;
        }
        return logDao.selectLogByUserid(userid, start, end);
    }

    @Override
    public int selectCount(int pageSize) {
        int pageCount = Integer.parseInt(logDao.selectCount().getUserid());
        return pageCount % pageSize == 0 ? pageCount/pageSize : pageCount/pageSize + 1;
    }

    @Override
    public int selectCountByUserid(String userid, int pageSize) {
        int pageCount = Integer.parseInt(logDao.selectCountByUserid(userid).getUserid());
        return pageCount % pageSize == 0 ? pageCount/pageSize : pageCount/pageSize + 1;
    }


    @Override
    public boolean insert(Log log) {
        log.setId(StringUtil.getGuid());
        return logDao.insert(log);
    }

    @Override
    public boolean delete(String id) {
        return logDao.delete(id);
    }

    @Override
    public boolean deleteThisUser(String userid) {
        return logDao.deleteThisUser(userid);
    }

    @Override
    public boolean deleteAll() {
        return logDao.deleteAll();
    }
}

