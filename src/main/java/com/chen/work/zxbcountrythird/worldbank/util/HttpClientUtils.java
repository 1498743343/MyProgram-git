package com.chen.work.zxbcountrythird.worldbank.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;

/**
 * @Author chenzihan
 * @Date 2020/7/30 16:37
 * @Description 发送http请求工具类
 */
@Slf4j
public class HttpClientUtils {
    private final static CloseableHttpClient HTTP_CLIENT = HttpClients.createDefault();
    // 设置配置请求参数
    private final static RequestConfig REQUEST_CONFIG = RequestConfig.custom().setConnectTimeout(35000)// 连接主机服务超时时间
                .setConnectionRequestTimeout(60000)// 请求超时时间
                .setSocketTimeout(90000)// 数据读取超时时间
                .build();

    private HttpClientUtils() {
    }

    public static CloseableHttpClient getHttpClient() {
        return HTTP_CLIENT;
    }

    /**
     * @Author chenzihan
     * @Date 2020/8/3 10:11
     * @Description 资源关闭方法
     */
    public static void close() {
        try {
            HTTP_CLIENT.close();
            log.info("HTTP_CLIENT close successful");
        } catch (IOException e) {
            log.error("HTTP_CLIENT close failed");
        }
    }

    /**
     * @Author chenzihan
     * @Date 2020/8/4 14:21
     * @Description 发送GET请求，将获取到的文件保存到指定路径
     */
    public static String downloadFile(String filePath,String url){
        CloseableHttpResponse response = null;
        String httpStr = null;
        try {
            // 创建httpGet远程连接实例
            HttpGet httpGet = new HttpGet(url);
            // 为httpGet实例设置配置
            httpGet.setConfig(REQUEST_CONFIG);
            // 执行get请求得到返回对象
            response = HTTP_CLIENT.execute(httpGet);
            // 通过返回对象获取返回数据
            HttpEntity entity = response.getEntity();
            Long fileLength = entity.getContentLength();
            BufferedInputStream inputStream = new BufferedInputStream(entity.getContent());
            FileOutputStream outputStream = new FileOutputStream(filePath);
            byte[] buf = new byte[2048];
            int size = 0;
            int len = 0;
            while ((size = inputStream.read(buf)) != -1) {
                len += size;
                outputStream.write(buf, 0, size);
            }
            inputStream.close();
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            log.error(e.getMessage(),e);
        }finally {
            try {
                response.close();
            } catch (IOException e) {
                log.error(e.getMessage(),e);
            }
        }
        return httpStr;
    }

    /**
     * @Description: 根据url发送GET请求，返回jsonArray字符串
     * @Param: url GET请求地址
     * @Return: String 获取到的JsonArray字符串
     * @Author: chenzihan
     * @Date: 2020/7/30 16:48
     */
    public static String getHttpStr(String url){
        CloseableHttpResponse response = null;
        String httpStr = null;
        try {
            // 创建httpGet远程连接实例
            HttpGet httpGet = new HttpGet(url);
            // 为httpGet实例设置配置
            httpGet.setConfig(REQUEST_CONFIG);
            // 执行get请求得到返回对象
            response = HTTP_CLIENT.execute(httpGet);
            // 通过返回对象获取返回数据
            HttpEntity entity = response.getEntity();
            httpStr = EntityUtils.toString(entity);
        } catch (IOException e) {
            log.error(e.getMessage(),e);
        }finally {
            try {
                response.close();
            } catch (IOException e) {
                log.error(e.getMessage(),e);
            }
        }
        return httpStr;
    }


}
