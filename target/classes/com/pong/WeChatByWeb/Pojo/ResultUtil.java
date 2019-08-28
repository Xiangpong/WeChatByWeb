package com.pong.WeChatByWeb.Pojo;

public class ResultUtil {
    public static Result success (String[] images) {
        Result result = new Result();
        result.setErrno(0);
        result.setData(images);
        return result;
    }
    public static Result success() {
        return success(null);
    }
}
