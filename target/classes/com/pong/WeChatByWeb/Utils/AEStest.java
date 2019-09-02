package com.pong.WeChatByWeb.Utils;

public class AEStest {

    public static void main(String[] args) {
        //16位
        String key = "MIGfMA0GCSqGSIb3";

        //字符串
        String str = "唱、跳、Rap、篮球";
        try {
            //加密
            String encrypt = AesUtil.encrypt(str, key);
            //解密
            String decrypt = AesUtil.decrypt(encrypt, key);

            System.out.println("加密前：" + str);
            System.out.println("加密后：" + encrypt);
            System.out.println("解密后：" + decrypt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
