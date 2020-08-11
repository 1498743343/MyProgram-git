package com.chen.work.zxbcountrythird.tradingeconomics.entity;


import com.google.gson.annotations.SerializedName;

/**
 * @description:当前页信息
 * @author: chenzihan
 * @date: 2020/7/28
 */
public class CurrentInfo {

    //数据时间
    private String lastupdated;

    //当前页
    private int page;

    //总页数
    private int pages;

    //每页数据量
    @SerializedName("per_page")
    private int perPage;

    //资源id
    private String sourceid;

    //总数据量
    private int total;

    @Override
    public String toString() {
        return "CurrentInfo{" +
                "lastupdated='" + lastupdated + '\'' +
                ", page=" + page +
                ", pages=" + pages +
                ", perPage=" + perPage +
                ", sourceid='" + sourceid + '\'' +
                ", total=" + total +
                '}';
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
