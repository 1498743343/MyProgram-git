package com.chen.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List list1 = list.subList(0,5);
        System.out.println(list1);
    }
}
