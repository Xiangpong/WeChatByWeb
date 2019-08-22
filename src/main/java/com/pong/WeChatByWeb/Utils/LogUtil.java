package com.pong.WeChatByWeb.Utils;

import com.pong.WeChatByWeb.Pojo.Log;

/**
 * Author :  吴湘鹏
 */
public class LogUtil {

    public Log setLog(String userid, String time, String type, String detail, String ip){
        Log log = new Log();
        log.setUserid(userid);
        log.setTime(time);
        log.setType(type);
        log.setDetail(detail);
        log.setIp(ip);
        return log;
    }

}
