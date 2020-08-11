package com.chen.work.zxbcountrythird.tradingeconomics;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @description:urlµ˜”√≤‚ ‘¿‡
 * @author: chenzihan
 * @date: 2020/7/28
 */
public class WorldBank {

        

    public static String constructUrl(String path) throws IOException
    {
        String _clientKey = "guest:guest";
        String base_url = "http://api.tradingeconomics.com";
        String auth = base_url + path + "?c=" + _clientKey;
        URL obj = new URL(auth);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());
        return String.valueOf(response);
    }
}
