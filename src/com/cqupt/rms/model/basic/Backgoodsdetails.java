package com.cqupt.rms.model.basic;

public class Backgoodsdetails {
    private String backgoodsid;

    private String goodsid;

    private Integer goodsnum;

    public String getBackgoodsid() {
        return backgoodsid;
    }

    public void setBackgoodsid(String backgoodsid) {
        this.backgoodsid = backgoodsid == null ? null : backgoodsid.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }
}