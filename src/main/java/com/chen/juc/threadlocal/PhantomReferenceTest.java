package com.chen.juc.threadlocal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
    public static void main(String[] args) {
        ReferenceQueue queue = new  ReferenceQueue();
        PhantomReference<Person> p = new PhantomReference<>(new Person(),queue);
        Person person = p.get();
        System.out.println(person);
    }
}
