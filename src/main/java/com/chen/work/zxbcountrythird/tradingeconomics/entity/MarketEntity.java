package com.chen.work.zxbcountrythird.tradingeconomics.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @description: –≥°¿‡
 * @author: chenzihan
 * @date: 2020/7/27
 */
public class MarketEntity {

    @SerializedName("Close")
    private BigDecimal close;

    @SerializedName("CloseDate")
    private String closeDate;

    @SerializedName("Country")
    private String country;

    @SerializedName("DailyChange")
    private BigDecimal dailyChange;

    @SerializedName("DailyPercentualChange")
    private BigDecimal dailyPercentualChange;

    @SerializedName("Date")
    private String date;

    @SerializedName("Group")
    private String group;

    @SerializedName("Importance")
    private int importance;

    @SerializedName("Last")
    private BigDecimal last;

    @SerializedName("LastUpdate")
    private String lastUpdate;

    @SerializedName("MonthlyChange")
    private BigDecimal monthlyChange;

    @SerializedName("MonthlyPercentualChange")
    private BigDecimal monthlyPercentualChange;

    @SerializedName("Name")
    private String name;

    @SerializedName("State")
    private String state;

    @SerializedName("Symbol")
    private String symbol;

    @SerializedName("Ticker")
    private String ticker;

    @SerializedName("URL")
    private String url;

    @SerializedName("WeeklyChange")
    private BigDecimal weeklyChange;

    @SerializedName("WeeklyPercentualChange")
    private BigDecimal weeklyPercentualChange;

    @SerializedName("YTDChange")
    private BigDecimal yTDChange;

    @SerializedName("YTDPercentualChange")
    private BigDecimal yTDPercentualChange;

    @SerializedName("YearlyChange")
    private BigDecimal yearlyChange;

    @SerializedName("YearlyPercentualChange")
    private BigDecimal yearlyPercentualChange;

    @SerializedName("decimals")
    private BigDecimal decimals;

    @SerializedName("frequency")
    private String frequency;

    @SerializedName("lastMonth")
    private BigDecimal lastMonth;

    @SerializedName("lastWeek")
    private BigDecimal lastWeek;

    @SerializedName("lastYear")
    private BigDecimal lastYear;

    @SerializedName("startYear")
    private BigDecimal startYear;

    @SerializedName("unit")
    private String unit;

    @SerializedName("yesterday")
    private BigDecimal yesterday;

    public MarketEntity(BigDecimal close, String closeDate, String country, BigDecimal dailyChange, BigDecimal dailyPercentualChange, String date, String group, int importance, BigDecimal last, String lastUpdate, BigDecimal monthlyChange, BigDecimal monthlyPercentualChange, String name, String state, String symbol, String ticker, String url, BigDecimal weeklyChange, BigDecimal weeklyPercentualChange, BigDecimal yTDChange, BigDecimal yTDPercentualChange, BigDecimal yearlyChange, BigDecimal yearlyPercentualChange, BigDecimal decimals, String frequency, BigDecimal lastMonth, BigDecimal lastWeek, BigDecimal lastYear, BigDecimal startYear, String unit, BigDecimal yesterday) {
        this.close = close;
        this.closeDate = closeDate;
        this.country = country;
        this.dailyChange = dailyChange;
        this.dailyPercentualChange = dailyPercentualChange;
        this.date = date;
        this.group = group;
        this.importance = importance;
        this.last = last;
        this.lastUpdate = lastUpdate;
        this.monthlyChange = monthlyChange;
        this.monthlyPercentualChange = monthlyPercentualChange;
        this.name = name;
        this.state = state;
        this.symbol = symbol;
        this.ticker = ticker;
        this.url = url;
        this.weeklyChange = weeklyChange;
        this.weeklyPercentualChange = weeklyPercentualChange;
        this.yTDChange = yTDChange;
        this.yTDPercentualChange = yTDPercentualChange;
        this.yearlyChange = yearlyChange;
        this.yearlyPercentualChange = yearlyPercentualChange;
        this.decimals = decimals;
        this.frequency = frequency;
        this.lastMonth = lastMonth;
        this.lastWeek = lastWeek;
        this.lastYear = lastYear;
        this.startYear = startYear;
        this.unit = unit;
        this.yesterday = yesterday;
    }

    @Override
    public String toString() {
        return "MarketEntity{" +
                "close=" + close +
                ", closeDate='" + closeDate + '\'' +
                ", country='" + country + '\'' +
                ", dailyChange=" + dailyChange +
                ", dailyPercentualChange=" + dailyPercentualChange +
                ", date='" + date + '\'' +
                ", group='" + group + '\'' +
                ", importance=" + importance +
                ", last=" + last +
                ", lastUpdate='" + lastUpdate + '\'' +
                ", monthlyChange=" + monthlyChange +
                ", monthlyPercentualChange=" + monthlyPercentualChange +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", symbol='" + symbol + '\'' +
                ", ticker='" + ticker + '\'' +
                ", url='" + url + '\'' +
                ", weeklyChange=" + weeklyChange +
                ", weeklyPercentualChange=" + weeklyPercentualChange +
                ", yTDChange=" + yTDChange +
                ", yTDPercentualChange=" + yTDPercentualChange +
                ", yearlyChange=" + yearlyChange +
                ", yearlyPercentualChange=" + yearlyPercentualChange +
                ", decimals=" + decimals +
                ", frequency='" + frequency + '\'' +
                ", lastMonth=" + lastMonth +
                ", lastWeek=" + lastWeek +
                ", lastYear=" + lastYear +
                ", startYear=" + startYear +
                ", unit='" + unit + '\'' +
                ", yesterday=" + yesterday +
                '}';
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getDailyChange() {
        return dailyChange;
    }

    public void setDailyChange(BigDecimal dailyChange) {
        this.dailyChange = dailyChange;
    }

    public BigDecimal getDailyPercentualChange() {
        return dailyPercentualChange;
    }

    public void setDailyPercentualChange(BigDecimal dailyPercentualChange) {
        this.dailyPercentualChange = dailyPercentualChange;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public BigDecimal getLast() {
        return last;
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public BigDecimal getMonthlyChange() {
        return monthlyChange;
    }

    public void setMonthlyChange(BigDecimal monthlyChange) {
        this.monthlyChange = monthlyChange;
    }

    public BigDecimal getMonthlyPercentualChange() {
        return monthlyPercentualChange;
    }

    public void setMonthlyPercentualChange(BigDecimal monthlyPercentualChange) {
        this.monthlyPercentualChange = monthlyPercentualChange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigDecimal getWeeklyChange() {
        return weeklyChange;
    }

    public void setWeeklyChange(BigDecimal weeklyChange) {
        this.weeklyChange = weeklyChange;
    }

    public BigDecimal getWeeklyPercentualChange() {
        return weeklyPercentualChange;
    }

    public void setWeeklyPercentualChange(BigDecimal weeklyPercentualChange) {
        this.weeklyPercentualChange = weeklyPercentualChange;
    }

    public BigDecimal getyTDChange() {
        return yTDChange;
    }

    public void setyTDChange(BigDecimal yTDChange) {
        this.yTDChange = yTDChange;
    }

    public BigDecimal getyTDPercentualChange() {
        return yTDPercentualChange;
    }

    public void setyTDPercentualChange(BigDecimal yTDPercentualChange) {
        this.yTDPercentualChange = yTDPercentualChange;
    }

    public BigDecimal getYearlyChange() {
        return yearlyChange;
    }

    public void setYearlyChange(BigDecimal yearlyChange) {
        this.yearlyChange = yearlyChange;
    }

    public BigDecimal getYearlyPercentualChange() {
        return yearlyPercentualChange;
    }

    public void setYearlyPercentualChange(BigDecimal yearlyPercentualChange) {
        this.yearlyPercentualChange = yearlyPercentualChange;
    }

    public BigDecimal getDecimals() {
        return decimals;
    }

    public void setDecimals(BigDecimal decimals) {
        this.decimals = decimals;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public BigDecimal getLastMonth() {
        return lastMonth;
    }

    public void setLastMonth(BigDecimal lastMonth) {
        this.lastMonth = lastMonth;
    }

    public BigDecimal getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(BigDecimal lastWeek) {
        this.lastWeek = lastWeek;
    }

    public BigDecimal getLastYear() {
        return lastYear;
    }

    public void setLastYear(BigDecimal lastYear) {
        this.lastYear = lastYear;
    }

    public BigDecimal getStartYear() {
        return startYear;
    }

    public void setStartYear(BigDecimal startYear) {
        this.startYear = startYear;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getYesterday() {
        return yesterday;
    }

    public void setYesterday(BigDecimal yesterday) {
        this.yesterday = yesterday;
    }
}
