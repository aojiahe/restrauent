package com.cqupt.rms.model.basic;

public class Packages {
    private Integer packageid;

    private String packagename;

    private Float packageprice;

    private Float packagediscount;

    private Integer packageunit;

    public Integer getPackageid() {
        return packageid;
    }

    public void setPackageid(Integer packageid) {
        this.packageid = packageid;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename == null ? null : packagename.trim();
    }

    public Float getPackageprice() {
        return packageprice;
    }

    public void setPackageprice(Float packageprice) {
        this.packageprice = packageprice;
    }

    public Float getPackagediscount() {
        return packagediscount;
    }

    public void setPackagediscount(Float packagediscount) {
        this.packagediscount = packagediscount;
    }

    public Integer getPackageunit() {
        return packageunit;
    }

    public void setPackageunit(Integer packageunit) {
        this.packageunit = packageunit;
    }
}