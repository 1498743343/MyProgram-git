package com.chen.work.zxbcountrythird.tradingeconomics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MarketSnaps
{
    public static void main(String[] args) throws IOException
    {
        //商品市场
        getMarketCommodities();
        //汇率市场
        getMarketCurrency();
//        getCurrencyCrosses();
        //股票市场
        getMarketIndexes();
        //债券市场
        getBonds();
//        getMarketSymbol();
//        getMarketPeers();
//        getMarketComponents();
//        getMarketByCountryPage();
//        getMarketSearch();
//        getMarketCategory();
//        getMarketCategoryPage();

    }


    /**
     * @description:http调用API
     * @author: chenzihan
     * @date: 2020/7/24
     */
    public static String constructUrl(String path) throws IOException
    {
//        String _clientKey = "8C9D1ECE9D88484:5BC0973E100C447";
        String _clientKey = "guest:guest";
        String base_url = "http://api.tradingeconomics.com";
        String auth;
        if (path.contains("?"))
            auth = base_url + path + "&c=" + _clientKey;
        else
            auth = base_url + path + "?c=" + _clientKey;


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



    /**
     * @description:商品市场API
     * @author: chenzihan
     * @date: 2020/7/24
     */
    public static  String getMarketCommodities() throws IOException
    {
        //set the path for the query
        String path = "/markets/commodities";

        System.out.println("--------List of commodities--------");
        return constructUrl(path);

    }


    /**
     * @description:汇率市场API
     * @author: chenzihan
     * @date: 2020/7/24
     */
    public static String getMarketCurrency() throws IOException {

        //set the path for the query
        String path = "/markets/currency";

        System.out.println("--------List of the major currencies--------");
        return constructUrl(path);

    }
    public static void getCurrencyCrosses() throws IOException {

        //put currency to cross here
        String params = "eur";
        params = params.replaceAll("\\s","%20");
        //set the path for the query
        String path = "/markets/currency" +  "?cross=" + params;

        System.out.println("--------Currency crosses--------");
        constructUrl(path);

    }

    /**
     * @description:股票市场API
     * @author: chenzihan
     * @date: 2020/7/24
     */
    public static String getMarketIndexes() throws IOException {

        //set the path for the query
        String path = "/markets/index";

        System.out.println("--------Get stock market indexes--------");
        return constructUrl(path);

    }

    /**
     * @description:债券市场API
     * @author: chenzihan
     * @date: 2020/7/24
     */
    public static String getBonds() throws IOException {

        //set the path for the query
        String path = "/markets/bonds";

        System.out.println("--------Get government bonds--------");
        return constructUrl(path);

    }
    public static void getMarketSymbol() throws IOException {

        //put symbol or symbols name here
        String params = "aapl:us";
        params = params.replaceAll("\\s","%20");
        //set the path for the query
        String path = "/markets/symbol" + "/" + params ;

        System.out.println("--------Get markets by symbol or symbols--------");
        constructUrl(path);

    }
    public static void getMarketPeers() throws IOException {

        //put symbol name here
        String params = "aapl:us";
        params = params.replaceAll("\\s","%20");
        //set the path for the query
        String path = "/markets/peers" + "/" + params ;

        System.out.println("--------A snapshot of latest peers prices by market--------");
        constructUrl(path);

    }
    public static void getMarketComponents() throws IOException {

        //put index component here
        String params = "psi20:ind";
        params = params.replaceAll("\\s","%20");
        //set the path for the query
        String path = "/markets/components" + "/" + params ;

        System.out.println("--------Get stock Market Index Components--------");
        constructUrl(path);

    }
    public static void getMarketByCountryPage() throws IOException {

        //put country name here
        String params = "united states";
        params = params.replaceAll("\\s","%20");
        //put page number here
        String page = "2";
        //set the path for the query
        String path = "/markets/country" + "/" + params + "?page=" + page;

        System.out.println("--------Get stock Market by country and page number--------");
        constructUrl(path);

    }
    public static void getMarketSearch() throws IOException {

        //By Default, the search will look into the categories: Indexes, markets(stocks), bonds, and commodities.
        //put search term here
        String params = "united states";
        params = params.replaceAll("\\s","%20");
        //set the path for the query
        String path = "/markets/search" + "/" + params;

        System.out.println("--------Search for country--------");
        constructUrl(path);

    }
    public static void getMarketCategory() throws IOException {

        //put country name here
        String params = "united states";
        params = params.replaceAll("\\s","%20");
        //put category name here
        //Categories available: index, markets, forex, bond and commodity.
        String params1 = "index,markets";
        params1 = params1.replaceAll("\\s","%20");
        //set the path for the query
        String path = "/markets/search" + "/" + params + "?category=" + params1;

        System.out.println("--------Search for country and category--------");
        constructUrl(path);

    }
    public static void getMarketCategoryPage() throws IOException {

        //put country name here
        String params = "united states";
        params = params.replaceAll("\\s","%20");
        //put category name here
        //Categories available: index, markets, forex, bond and commodity.
        String params1 = "index,markets";
        params1 = params1.replaceAll("\\s","%20");
        //put page number here
        String page = "2";
        //set the path for the query
        String path = "/markets/search" + "/" + params + "?category=" + params1 + "&page=";

        System.out.println("--------Search for country and category and page number--------");
        constructUrl(path);

    }
}



