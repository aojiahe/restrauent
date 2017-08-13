package com.cqupt.rms.model.basic;

public class Ordergoodsdetails {
    private String orderid;

    private String goodsid;

    private Integer goodsnum;

    private Float goodsprice;

    private Float goodsdiscount;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
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

    public Float getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Float goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Float getGoodsdiscount() {
        return goodsdiscount;
    }

    public void setGoodsdiscount(Float goodsdiscount) {
        this.goodsdiscount = goodsdiscount;
    }
}