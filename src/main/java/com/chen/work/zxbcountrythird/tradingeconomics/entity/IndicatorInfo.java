package com.chen.work.zxbcountrythird.tradingeconomics.entity;

public class IndicatorInfo {
    private String id;

    private String value;

    @Override
    public String toString() {
        return "CountryInfo{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
