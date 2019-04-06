package com.fh.shop.backend.model.user;

import org.fh.shop.admin.zc.model.Page;

import java.io.Serializable;

public class DeptInfo extends Page implements Serializable{
    private static final long serialVersionUID = 66989487921576419L;
    private int id;
    private String deptName;
    private String remark;
    private int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
