package com.pong.WeChatByWeb.WebSocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.HashMap;
import java.util.Map;

/**
 * WebSocket服务
 */
@Component
@ServerEndpoint(value = "/websocket/{userId}/{publicKey}", configurator = HttpSessionConfigurator.class)
public class WebSocketServer {
    //省略其他代码

    /**
     * 登录用户的前端公钥Map集合（其实应该放在Redis）
     */
    private static Map<Session, String> loginPublicKeyList = new HashMap<Session, String>();

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("userId") String userId, @PathParam("publicKey") String publicKey) {
        //省略其他代码

        //设置前端公钥，因为是url的方式传值，公钥中的/需要进行转换一下，传到后端再转回来，然后将每个用户的前端公钥存储起来
        loginPublicKeyList.put(session,publicKey.replaceAll(",", "/"));

    }
}