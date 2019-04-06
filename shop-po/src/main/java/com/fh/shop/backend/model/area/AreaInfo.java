package com.fh.shop.backend.model.area;

import java.io.Serializable;

public class AreaInfo implements Serializable {
    private static final long serialVersionUID = 4920231777215365889L;
    private int id;
    private String areaName;
    private Integer pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
