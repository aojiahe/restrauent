package com.cqupt.rms.model.basic;

import java.util.Date;

public class Assignment {
    private String assid;

    private String empid;

    private String deptid;

    private Date assignmenttime;

    private String operateempid;

    public String getAssid() {
        return assid;
    }

    public void setAssid(String assid) {
        this.assid = assid == null ? null : assid.trim();
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid == null ? null : empid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public Date getAssignmenttime() {
        return assignmenttime;
    }

    public void setAssignmenttime(Date assignmenttime) {
        this.assignmenttime = assignmenttime;
    }

    public String getOperateempid() {
        return operateempid;
    }

    public void setOperateempid(String operateempid) {
        this.operateempid = operateempid == null ? null : operateempid.trim();
    }
}