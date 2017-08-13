package com.cqupt.rms.model.basic;

public class Supplier {
    private String supid;

    private String supname;

    private String telnumber;

    private String address;

    private String remark;

    private String providegoods;

    public String getSupid() {
        return supid;
    }

    public void setSupid(String supid) {
        this.supid = supid == null ? null : supid.trim();
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname == null ? null : supname.trim();
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getProvidegoods() {
        return providegoods;
    }

    public void setProvidegoods(String providegoods) {
        this.providegoods = providegoods == null ? null : providegoods.trim();
    }
}