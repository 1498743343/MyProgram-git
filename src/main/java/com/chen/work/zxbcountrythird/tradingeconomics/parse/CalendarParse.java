package com.chen.work.zxbcountrythird.tradingeconomics.parse;

import com.chen.utils.TimestampTypeAdapter;
import com.chen.work.zxbcountrythird.tradingeconomics.entity.CalendarEntity;
import com.chen.work.zxbcountrythird.tradingeconomics.http.CalendarTest;
import com.google.gson.*;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class CalendarParse {


        public static void main(String[] args) throws IOException {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Timestamp.class,new TimestampTypeAdapter(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"))).create();
//        String calendar = Calendar.getCalendar();

            String calendar = CalendarTest.getJsonStr();
        JsonArray jsonArray= new JsonParser().parse(calendar).getAsJsonArray();
        System.out.println(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement entity = jsonArray.get(i);
            CalendarEntity calendarEntity = gson.fromJson(entity, CalendarEntity.class);
            System.out.println(calendarEntity);
        }
    }
}
