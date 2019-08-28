package com.pong.WeChatByWeb.Pojo;

import java.io.Serializable;

public class Result implements Serializable {
    private Integer errno;
    private String[] data;
    public Result() {}
    public Integer getErrno() {
        return errno;
    }
    public void setErrno(Integer errno) {
        this.errno = errno;
    }
    public String[] getData() {
        return data;
    }
    public void setData(String[] images) {
        this.data = images;
    }
}
