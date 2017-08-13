package com.cqupt.rms.model.basic;

public class Supplydetails {
    private String suporderid;

    private String goodsid;

    private Integer goodsnum;

    private Float orderprice;

    public String getSuporderid() {
        return suporderid;
    }

    public void setSuporderid(String suporderid) {
        this.suporderid = suporderid == null ? null : suporderid.trim();
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

    public Float getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Float orderprice) {
        this.orderprice = orderprice;
    }
}