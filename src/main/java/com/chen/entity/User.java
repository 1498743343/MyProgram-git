package com.chen.entity;


import lombok.Data;

@Data
public class User {
    private int userId;
    private String username;
    private int age;

    public User() {
    }

    public User(int userId, String username, int age) {
        this.userId = userId;
        this.username = username;
        this.age = age;
    }
}
