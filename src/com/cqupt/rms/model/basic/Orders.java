package com.cqupt.rms.model.basic;

import java.util.Date;

public class Orders {
    private String orderid;

    private String cusid;

    private String operateempid;

    private Integer ordernumber;

    private Float orderprice;

    private Date ordertime;

    private Date repasttime;

    private Integer payment;

    private Integer restaurantid;

    private Float totalprice;

    private Float paytotalprice;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCusid() {
        return cusid;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid == null ? null : cusid.trim();
    }

    public String getOperateempid() {
        return operateempid;
    }

    public void setOperateempid(String operateempid) {
        this.operateempid = operateempid == null ? null : operateempid.trim();
    }

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Float getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Float orderprice) {
        this.orderprice = orderprice;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getRepasttime() {
        return repasttime;
    }

    public void setRepasttime(Date repasttime) {
        this.repasttime = repasttime;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(Integer restaurantid) {
        this.restaurantid = restaurantid;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public Float getPaytotalprice() {
        return paytotalprice;
    }

    public void setPaytotalprice(Float paytotalprice) {
        this.paytotalprice = paytotalprice;
    }
}