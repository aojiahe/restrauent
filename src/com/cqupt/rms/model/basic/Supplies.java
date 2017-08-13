package com.cqupt.rms.model.basic;

import java.util.Date;

public class Supplies {
    private String suporderid;

    private Date supordertime;

    private Float dues;

    private Float alreadypaid;

    private String operateempid;

    private String supid;

    private String status;

    public String getSuporderid() {
        return suporderid;
    }

    public void setSuporderid(String suporderid) {
        this.suporderid = suporderid == null ? null : suporderid.trim();
    }

    public Date getSupordertime() {
        return supordertime;
    }

    public void setSupordertime(Date supordertime) {
        this.supordertime = supordertime;
    }

    public Float getDues() {
        return dues;
    }

    public void setDues(Float dues) {
        this.dues = dues;
    }

    public Float getAlreadypaid() {
        return alreadypaid;
    }

    public void setAlreadypaid(Float alreadypaid) {
        this.alreadypaid = alreadypaid;
    }

    public String getOperateempid() {
        return operateempid;
    }

    public void setOperateempid(String operateempid) {
        this.operateempid = operateempid == null ? null : operateempid.trim();
    }

    public String getSupid() {
        return supid;
    }

    public void setSupid(String supid) {
        this.supid = supid == null ? null : supid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}