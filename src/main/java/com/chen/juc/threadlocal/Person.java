package com.chen.juc.threadlocal;

import lombok.Data;

@Data
public class Person {
    private int age;
    private String name;
    @Override
    public void finalize(){
        System.out.println("this object has been recycle");
    }
}
