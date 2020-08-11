package com.chen.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            map.put("key"+i,i);
        }
        // 遍历方式一：entrySet方法
        Set<Map.Entry<String, Object>> set = map.entrySet();
        for (Map.Entry<String,Object> entry:set) {
            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        }
    }
}
