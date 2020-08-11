package com.chen.work.zxbcountrythird.worldbank.util;


import java.io.File;
import java.io.IOException;

public class ZipUtil {

    public static void unzip(String zipFilePath,String exportFilePath) throws IOException {
        File zipFile = new File(zipFilePath);
        if(!zipFile.exists()){
            System.out.println("zipFile doesn't exist");
        }

    }

    public static void main(String[] args) {

    }
}
