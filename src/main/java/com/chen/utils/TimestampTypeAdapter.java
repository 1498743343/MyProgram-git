package com.chen.utils;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampTypeAdapter implements JsonSerializer<Timestamp>, JsonDeserializer<Timestamp> {
    private DateFormat format;

    public TimestampTypeAdapter(DateFormat format) {
        this.format = format;
    }
    @Override
    public Timestamp deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (!(json instanceof JsonPrimitive)) {
            throw new JsonParseException("The date should be a string value");
        }
        Date date = null;
        try {
            date = format.parse(json.getAsString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Timestamp(date.getTime());

    }

    @Override
    public JsonElement serialize(Timestamp src, Type typeOfSrc, JsonSerializationContext context) {
        String dfString = format.format(new Date(src.getTime()));
        return new JsonPrimitive(dfString);
    }
}
