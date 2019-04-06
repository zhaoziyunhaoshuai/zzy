package com.fh.shop.backend.model.user;


import org.fh.shop.admin.zc.model.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserInfo extends Page implements Serializable {

    private static final long serialVersionUID = -5237959044174394073L;
    private int id;
    private String userName;
    private String realName;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    private Integer sex;
    private String userPassword;
    private String imgCode;
    private String salt;
    private Date lastLoginTime;
    private Date thisLoginTime;
    private int loginCount;
    private int errorCount;
    private Date errorLoginTime;
    private Integer salary;
    private Integer minSalary;
    private Integer maxSalary;
    private DeptInfo deptId;
    private String birthdayStr;
    private List<Integer> idList;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date minBirthday;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date maxBirthday;
    private String userImagePath;

    public String getUserImagePath() {
        return userImagePath;
    }

    public void setUserImagePath(String userImagePath) {
        this.userImagePath = userImagePath;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Date getMinBirthday() {
        return minBirthday;
    }

    public void setMinBirthday(Date minBirthday) {
        this.minBirthday = minBirthday;
    }

    public Date getMaxBirthday() {
        return maxBirthday;
    }

    public void setMaxBirthday(Date maxBirthday) {
        this.maxBirthday = maxBirthday;
    }

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public String getBirthdayStr() {
        return birthdayStr;
    }

    public void setBirthdayStr(String birthdayStr) {
        this.birthdayStr = birthdayStr;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public DeptInfo getDeptId() {
        return deptId;
    }

    public void setDeptId(DeptInfo deptId) {
        this.deptId = deptId;
    }

    public Date getErrorLoginTime() {
        return errorLoginTime;
    }

    public void setErrorLoginTime(Date errorLoginTime) {
        this.errorLoginTime = errorLoginTime;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getThisLoginTime() {
        return thisLoginTime;
    }

    public void setThisLoginTime(Date thisLoginTime) {
        this.thisLoginTime = thisLoginTime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
