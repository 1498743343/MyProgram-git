package com.chen.work.zxbcountrythird.tradingeconomics.parse;

import com.chen.work.zxbcountrythird.tradingeconomics.MarketSnaps;
import com.chen.work.zxbcountrythird.tradingeconomics.entity.MarketEntity;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;

public class MarketParse {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        //�����г�
        String marketCurrency = MarketSnaps.getMarketCurrency();

        //��Ʊ�г�
//        String marketCurrency = MarketSnaps.getMarketIndexes();

        //��Ʒ�г�
//        String marketCurrency = MarketSnaps.getMarketCommodities();

        //ծȯ�г�
//        String marketCurrency = MarketSnaps.getBonds();
        JsonArray jsonArray= new JsonParser().parse(marketCurrency).getAsJsonArray();
        System.out.println(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement entity = jsonArray.get(i);
            MarketEntity marketEntity = gson.fromJson(entity, MarketEntity.class);
            System.out.println(marketEntity);
        }
    }
}
