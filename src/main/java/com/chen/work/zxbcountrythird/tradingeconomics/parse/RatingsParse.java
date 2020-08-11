package com.chen.work.zxbcountrythird.tradingeconomics.parse;

import com.chen.work.zxbcountrythird.tradingeconomics.Ratings;
import com.chen.work.zxbcountrythird.tradingeconomics.entity.RatingsEntity;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;

public class RatingsParse {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        String ratings = Ratings.getRatings();
        JsonArray jsonArray= new JsonParser().parse(ratings).getAsJsonArray();
        System.out.println(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement entity = jsonArray.get(i);
            RatingsEntity ratingsEntity = gson.fromJson(entity, RatingsEntity.class);
            System.out.println(ratingsEntity);
        }
    }
}
