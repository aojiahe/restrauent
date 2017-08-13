package com.cqupt.rms.model.basic;

public class Backgoods {
    private String backgoodsid;

    private String operateempid;

    private String deptid;

    private String backempid;

    public String getBackgoodsid() {
        return backgoodsid;
    }

    public void setBackgoodsid(String backgoodsid) {
        this.backgoodsid = backgoodsid == null ? null : backgoodsid.trim();
    }

    public String getOperateempid() {
        return operateempid;
    }

    public void setOperateempid(String operateempid) {
        this.operateempid = operateempid == null ? null : operateempid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getBackempid() {
        return backempid;
    }

    public void setBackempid(String backempid) {
        this.backempid = backempid == null ? null : backempid.trim();
    }
}