package com.pong.WeChatByWeb.WebSocket;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 * Author :  吴湘鹏
 * TODO   :
 */
@ServerEndpoint(value = "/videoServer/{uid}", configurator = HttpSessionConfigurator.class)
public class VideoServer {
    private static final int MAX_CONNECTION = 20;
    private static final long MAX_TIMEOUT = 2 * 60 * 1000;
    private static final Map<String, String> usermap = Collections.synchronizedMap(new HashMap<String, String>());
    private static final Map<String, Session> sessions = Collections.synchronizedMap(new HashMap<String, Session>());
    /**
     * 打开websocket
     * @param session websocket的session
     * @param uid 打开用户的UID
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("uid")String uid) {
        session.setMaxIdleTimeout(MAX_TIMEOUT);
        sessions.put(uid, session);
    }

    /**
     * websocket关闭
     * @param session 关闭的session
     * @param uid 关闭的用户标识
     */
    @OnClose
    public void onClose(Session session, @PathParam("uid")String uid) {
        remove(session, uid);
    }

    /**
     * 收到消息
     * @param message 消息内容
     * @param session 发送消息的session
     * @param uid
     */
    @OnMessage
    public void onMessage(String message, Session session, @PathParam("uid")String uid) {
        try {
            if(uid != null && usermap.get(uid) != null && VideoServer.sessions.get(usermap.get(uid)) != null) {
                Session osession = sessions.get(usermap.get(uid)); // 被呼叫的session
                if(osession.isOpen())
                    osession.getAsyncRemote().sendText(new String(message.getBytes("utf-8")));
                else
                    this.nowaiting(osession);
            } else {
                this.nowaiting(session);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 没有人在等待
     * @param session 发送消息的session
     */
    private void nowaiting(Session session) {
        session.getAsyncRemote().sendText("{\"type\" : \"nowaiting\"}");
    }

    /**
     * 是否可以继续创建通话房间
     * @return 可以：true；不可以false；
     */
    public static boolean canCreate() {
        return sessions.size() <= MAX_CONNECTION;
    }

    /**
     * 判断是否可以加入
     * @param oid 被申请对话的ID
     * @return 如果能加入返回：true；否则返回false；
     */
    public static boolean canJoin(String oid) {
        return !(oid != null && usermap.containsKey(oid) && usermap.get(oid) != null);
    }

    /**
     * 添加视频对象
     * @param uid 申请对话的ID
     * @param oid 被申请对话的ID
     * @return 是否是创建者：如果没有申请对话ID为创建者，否则为为加入者。创建者返回：true；加入者返回：false；
     */
    public static boolean addUser(String uid, String oid) {
        if(oid != null && !oid.isEmpty()) {
            VideoServer.usermap.put(uid, oid);
            VideoServer.usermap.put(oid, uid);

            return false;
        } else {
            VideoServer.usermap.put(uid, null);

            return true;
        }
    }

    /**
     * 移除聊天用户
     * @param session 移除的session
     * @param uid 移除的UID
     */
    private static void remove(Session session, String uid) {
        String oid = usermap.get(uid);

        if(oid != null) usermap.put(oid, null); // 设置对方无人聊天

        sessions.remove(uid); // 异常session
        usermap.remove(uid); // 移除自己

        try {
            if(session != null && session.isOpen()) session.close(); // 关闭session
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
