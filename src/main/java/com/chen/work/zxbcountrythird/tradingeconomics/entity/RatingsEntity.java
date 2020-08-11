package com.chen.work.zxbcountrythird.tradingeconomics.entity;

import com.google.gson.annotations.SerializedName;


/**
 * @description:∆¿º∂¿‡
 * @author: chenzihan
 * @date: 2020/7/27
 */
public class RatingsEntity {

    @SerializedName("Country")
    private String country;

    @SerializedName("DBRS")
    private String dBRS;

    @SerializedName("DBRS_Outlook")
    private String dBRSOutlook;

    @SerializedName("Fitch")
    private String fitch;

    @SerializedName("Fitch_Outlook")
    private String fitchOutlook;

    @SerializedName("Moodys")
    private String moodys;

    @SerializedName("Moodys_Outlook")
    private String moodysOutlook;

    @SerializedName("SP")
    private String sP;

    @SerializedName("SP_Outlook")
    private String sPOutlook;

    @SerializedName("TE")
    private String tE;

    @SerializedName("TE_Outlook")
    private String tEOutlook;


    @Override
    public String toString() {
        return "RatingsEntity{" +
                "country='" + country + '\'' +
                ", dBRS='" + dBRS + '\'' +
                ", dBRSOutlook='" + dBRSOutlook + '\'' +
                ", fitch='" + fitch + '\'' +
                ", fitchOutlook='" + fitchOutlook + '\'' +
                ", moodys='" + moodys + '\'' +
                ", moodysOutlook='" + moodysOutlook + '\'' +
                ", sP='" + sP + '\'' +
                ", sPOutlook='" + sPOutlook + '\'' +
                ", tE='" + tE + '\'' +
                ", tEOutlook='" + tEOutlook + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getdBRS() {
        return dBRS;
    }

    public void setdBRS(String dBRS) {
        this.dBRS = dBRS;
    }

    public String getdBRSOutlook() {
        return dBRSOutlook;
    }

    public void setdBRSOutlook(String dBRSOutlook) {
        this.dBRSOutlook = dBRSOutlook;
    }

    public String getFitch() {
        return fitch;
    }

    public void setFitch(String fitch) {
        this.fitch = fitch;
    }

    public String getFitchOutlook() {
        return fitchOutlook;
    }

    public void setFitchOutlook(String fitchOutlook) {
        this.fitchOutlook = fitchOutlook;
    }

    public String getMoodys() {
        return moodys;
    }

    public void setMoodys(String moodys) {
        this.moodys = moodys;
    }

    public String getMoodysOutlook() {
        return moodysOutlook;
    }

    public void setMoodysOutlook(String moodysOutlook) {
        this.moodysOutlook = moodysOutlook;
    }

    public String getsP() {
        return sP;
    }

    public void setsP(String sP) {
        this.sP = sP;
    }

    public String getsPOutlook() {
        return sPOutlook;
    }

    public void setsPOutlook(String sPOutlook) {
        this.sPOutlook = sPOutlook;
    }

    public String gettE() {
        return tE;
    }

    public void settE(String tE) {
        this.tE = tE;
    }

    public String gettEOutlook() {
        return tEOutlook;
    }

    public void settEOutlook(String tEOutlook) {
        this.tEOutlook = tEOutlook;
    }
}
