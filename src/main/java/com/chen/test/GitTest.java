package com.chen.test;

import com.chen.utils.AesUtils;

public class GitTest {
    public static void main(String[] args) {
        String pwd = "ko40qPEikLYw75YTQ/SEWw==";
        String decrypt = AesUtils.decrypt(pwd);
        System.out.println(decrypt);
    }
}
