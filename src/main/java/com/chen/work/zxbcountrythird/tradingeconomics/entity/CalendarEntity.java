package com.chen.work.zxbcountrythird.tradingeconomics.entity;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @description:??????
 * @author: chenzihan
 * @date: 2020/7/27
 */
@Data
public class CalendarEntity {
    @SerializedName("Actual")
    private String actual;

    @SerializedName("CalendarId")
    private String calendarId;

    @SerializedName("Category")
    private String category;

    @SerializedName("Country")
    private String country;

    @SerializedName("Currency")
    private String currency;

    @SerializedName("Date")
    private Timestamp date;

    @SerializedName("DateSpan")
    private String dateSpan;

    @SerializedName("Event")
    private String event;

    @SerializedName("Forecast")
    private String forecast;

    @SerializedName("Importance")
    private int importance;

    @SerializedName("LastUpdate")
    private Timestamp lastUpdate;

    @SerializedName("OCategory")
    private String oCategory;

    @SerializedName("OCountry")
    private String oCountry;

    @SerializedName("Previous")
    private String previous;

    @SerializedName("Reference")
    private String reference;

    @SerializedName("ReferenceDate")
    private Timestamp referenceDate;

    @SerializedName("Revised")
    private String revised;

    @SerializedName("Source")
    private String source;

    @SerializedName("Symbol")
    private String symbol;

    @SerializedName("TEForecast")
    private String tEForecast;

    @SerializedName("Ticker")
    private String ticker;

    @SerializedName("URL")
    private String url;

    @SerializedName("Unit")
    private String unit;
}
