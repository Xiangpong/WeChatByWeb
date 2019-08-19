package com.pong.WeChatByWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContaller {

    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
}
