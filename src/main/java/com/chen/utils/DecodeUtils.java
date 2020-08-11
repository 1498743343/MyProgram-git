package com.chen.utils;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @description:    URL参数解码工具
 * @author: chenzihan
 * @date: 2020/5/18
 */
public class DecodeUtils {

    public static String decode(String params) throws UnsupportedEncodingException {
        String decode = URLDecoder.decode(params, "utf-8");
        return decode;
    }
    public static String encode(String params) throws UnsupportedEncodingException {
        String encode = URLEncoder.encode(params, "utf-8");
        return encode;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String decode =
                "%7B%22dasId%22%3A1%2C%22sysUserId%22%3A%22192%22%2C%22metadataType%22%3A%22TABLE%22%7D"
                ;
        String encode = "{\"dasId\":51,\"sysUserId\":\"192\",\"metadataType\":\"TABLE\"}";
        System.out.println(decode(decode));
        System.out.println(encode(encode));

    }
}
