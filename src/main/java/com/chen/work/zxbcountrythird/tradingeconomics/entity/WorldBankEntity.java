package com.chen.work.zxbcountrythird.tradingeconomics.entity;

import java.util.List;

public class WorldBankEntity {
    private CurrentInfo currentInfo;
    private List<DataInfo> dataInfoList;

    @Override
    public String toString() {
        return "WorldBankEntity{" +
                "currentInfo=" + currentInfo +
                ", dataInfoList=" + dataInfoList +
                '}';
    }

    public CurrentInfo getCurrentInfo() {
        return currentInfo;
    }

    public void setCurrentInfo(CurrentInfo currentInfo) {
        this.currentInfo = currentInfo;
    }

    public List<DataInfo> getDataInfoList() {
        return dataInfoList;
    }

    public void setDataInfoList(List<DataInfo> dataInfoList) {
        this.dataInfoList = dataInfoList;
    }
}
