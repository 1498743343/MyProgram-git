package com.chen.test;

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName ListTest
 * Description TODO
 * Author chenzihan
 * Date 2020/5/12 14:26
 **/

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");
        list.add("");
        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//           String next = iterator.next();
//           if (next.equals("d")){
//               iterator.remove();
//           }
//        }
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("d")){
                iterator.remove();
            }
        }
        System.out.println(list);
//        list.removeIf((str->(StringUtils.isEmpty(str))));
    }
}
