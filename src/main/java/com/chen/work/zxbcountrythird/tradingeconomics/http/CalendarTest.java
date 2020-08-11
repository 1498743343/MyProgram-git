package com.chen.work.zxbcountrythird.tradingeconomics.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class CalendarTest {

    public static String constructUrl(String path) throws IOException
    {
        String _clientKey = "8C9D1ECE9D88484:5BC0973E100C447";
//        String _clientKey = "guest:guest";
        String base_url = "http://api.tradingeconomics.com";
        String auth = base_url + path + "?c=" + _clientKey;
        System.out.println("url = " + auth);
        return String.valueOf(auth);
    }

    public static String getJsonStr () throws IOException {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        // 通过址默认配置创建一个httpClient实例
        String url = CalendarTest.constructUrl("/calendar");
        httpClient = HttpClients.createDefault();
        // 创建httpGet远程连接实例
        HttpGet httpGet = new HttpGet(url);
        // 设置配置请求参数
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(35000)// 连接主机服务超时时间
                .setConnectionRequestTimeout(35000)// 请求超时时间
                .setSocketTimeout(60000)// 数据读取超时时间
                .build();
        // 为httpGet实例设置配置
        httpGet.setConfig(requestConfig);
        // 执行get请求得到返回对象
        response = httpClient.execute(httpGet);
        // 通过返回对象获取返回数据
        HttpEntity entity = response.getEntity();
        // 通过EntityUtils中的toString方法将结果转换为字符串
        String result = EntityUtils.toString(entity);
        System.out.println(result);
        return result;
    }
}
