package com.chen.test;

/**
 * ClassName StringTest
 * Description TODO
 * Author chenzihan
 * Date 2020/5/13 9:45
 **/

public class StringTest {
    public static void main(String[] args) {
        String s1 = "你好";
        String s2 = "你";
        String s3 = "好";
        String s4 = s2+s3;
        String s5 = "你"+"好";
        System.out.println(s1==s4);
        System.out.println(s1==s5);
    }
}
