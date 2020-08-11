package com.chen.test;

import com.chen.entity.User;
import com.chen.utils.AesUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ClassName StringTest
 * Description TODO
 * Author chenzihan
 * Date 2020/5/13 9:45
 **/

public class StringTest {
    public static void main(String[] args) {
        String password = "nuLnNnLjcgUS7CpBwIMKJg==";
        String decrypt = AesUtils.decrypt(password);
        System.out.println(decrypt);
        String pass = DigestUtils.md5Hex(decrypt);
        System.out.println(pass);
    }
}
