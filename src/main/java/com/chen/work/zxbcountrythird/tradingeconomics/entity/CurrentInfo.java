package com.chen.work.zxbcountrythird.tradingeconomics.entity;


import com.google.gson.annotations.SerializedName;

/**
 * @description:��ǰҳ��Ϣ
 * @author: chenzihan
 * @date: 2020/7/28
 */
public class CurrentInfo {

    //����ʱ��
    private String lastupdated;

    //��ǰҳ
    private int page;

    //��ҳ��
    private int pages;

    //ÿҳ������
    @SerializedName("per_page")
    private int perPage;

    //��Դid
    private String sourceid;

    //��������
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
