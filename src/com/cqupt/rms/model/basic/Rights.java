package com.cqupt.rms.model.basic;

public class Rights {
    private Integer rightid;

    private String rightname;

    private String rightdescription;

    public Integer getRightid() {
        return rightid;
    }

    public void setRightid(Integer rightid) {
        this.rightid = rightid;
    }

    public String getRightname() {
        return rightname;
    }

    public void setRightname(String rightname) {
        this.rightname = rightname == null ? null : rightname.trim();
    }

    public String getRightdescription() {
        return rightdescription;
    }

    public void setRightdescription(String rightdescription) {
        this.rightdescription = rightdescription == null ? null : rightdescription.trim();
    }
}