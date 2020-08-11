package com.chen.work.zxbcountrythird.tradingeconomics.entity;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class DataInfo {
    private CountryInfo countryInfo;
    private String countryiso3code;
    private String date;
    private int decimal;
    private IndicatorInfo indicatorInfo;
    @SerializedName("obs_status")
    private String obsStatus;
    private String unit;
    private BigDecimal value;

    @Override
    public String toString() {
        return "DataInfo{" +
                "countryInfo=" + countryInfo +
                ", countryiso3code='" + countryiso3code + '\'' +
                ", date='" + date + '\'' +
                ", decimal=" + decimal +
                ", indicatorInfo=" + indicatorInfo +
                ", obsStatus='" + obsStatus + '\'' +
                ", unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }

    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    public String getCountryiso3code() {
        return countryiso3code;
    }

    public void setCountryiso3code(String countryiso3code) {
        this.countryiso3code = countryiso3code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public IndicatorInfo getIndicatorInfo() {
        return indicatorInfo;
    }

    public void setIndicatorInfo(IndicatorInfo indicatorInfo) {
        this.indicatorInfo = indicatorInfo;
    }

    public String getObsStatus() {
        return obsStatus;
    }

    public void setObsStatus(String obsStatus) {
        this.obsStatus = obsStatus;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
