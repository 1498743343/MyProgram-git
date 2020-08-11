package com.chen.work.zxbcountrythird.worldbank;

import com.chen.work.zxbcountrythird.worldbank.util.HttpClientUtils;
import lombok.SneakyThrows;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

import java.io.FileOutputStream;

/**
 * @Author chenzihan
 * @Date 2020/8/4 10:50
 * @Description CsvÎÄ¼þ½âÎö
 */
public class CsvParse {
    @SneakyThrows
    public static void main(String[] args) {
        String zipUrl = "http://data.gdeltproject.org/gdeltv2/lastupdate.txt";
        String httpStr = HttpClientUtils.getHttpStr(zipUrl).toString();
        System.out.println("httpStr = "+ httpStr);
        int i = httpStr.lastIndexOf("export.CSV.zip");
        int http = httpStr.indexOf("http");
        String substring = httpStr.substring(http, i);
        String url = substring+"export.CSV.zip";
        System.out.println("zipUrl = " + url);
        String filePath = "D:\\work\\worldBank\\test.zip";
        HttpClientUtils.downloadFile(filePath,url);
    }
}
