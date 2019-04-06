package com.fh.shop.backend.model.log;

import org.fh.shop.admin.zc.model.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class LogInfo extends Page implements Serializable {
    private static final long serialVersionUID = -369416261772171443L;
    private Long id;
    private String userName;
    private String info;
    private Integer status;
    private Date createTime;
    private Long useTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date minCreateTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date maxCreateTime;
    private Long minUseTime;
    private Long maxUseTime;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getMinCreateTime() {
        return minCreateTime;
    }

    public void setMinCreateTime(Date minCreateTime) {
        this.minCreateTime = minCreateTime;
    }

    public Date getMaxCreateTime() {
        return maxCreateTime;
    }

    public void setMaxCreateTime(Date maxCreateTime) {
        this.maxCreateTime = maxCreateTime;
    }

    public Long getMinUseTime() {
        return minUseTime;
    }

    public void setMinUseTime(Long minUseTime) {
        this.minUseTime = minUseTime;
    }

    public Long getMaxUseTime() {
        return maxUseTime;
    }

    public void setMaxUseTime(Long maxUseTime) {
        this.maxUseTime = maxUseTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUseTime() {
        return useTime;
    }

    public void setUseTime(Long userTime) {
        this.useTime = userTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
