package com.chen.test;

public class ExceptionTest {
    public static void main(String[] args) {
//        try{
            int a = 1;
            int b = 0;
            int c = a/b;
            System.out.println("c = "+c);
            System.out.println("after exception");
//        }catch (Exception e){
//            System.out.println(e);
//        }
        System.out.println("this is main after");
    }
}
