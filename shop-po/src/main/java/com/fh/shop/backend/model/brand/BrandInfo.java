/** 
 * <pre>项目名称:homeWork 
 * 文件名称:BrandInfo.java 
 * 包名:com.fh.shop.backend.po.brand 
 * 创建日期:2019年1月27日下午5:26:08 
 * Copyright (c) 2019, xxxxxx@163.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.backend.model.brand;

import java.io.Serializable;
import java.util.Date;

import org.fh.shop.admin.zc.model.Page;
import org.springframework.format.annotation.DateTimeFormat;

/** 
 * <pre>项目名称：homeWork    
 * 类名称：BrandInfo    
 * 类描述：    
 * 创建人：赵晨 786071823@qq.com    
 * 创建时间：2019年1月27日 下午5:26:08    
 * 修改人：赵晨 786071823@qq.com     
 * 修改时间：2019年1月27日 下午5:26:08    
 * 修改备注：       
 * @version </pre>    
 */
public class BrandInfo extends Page implements Serializable
{

	private static final long serialVersionUID = 988508771359598461L;
	private int id;
	private String brandName;
	private Date insertTime;
	private Date updateTime;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date minInsertTime;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date maxInsertTime;
	@DateTimeFormat(pattern="yyyy-MM-dd HH")
	private Date minUpdateTime;
	@DateTimeFormat(pattern="yyyy-MM-dd HH")
	private Date maxUpdateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getMinInsertTime() {
		return minInsertTime;
	}
	public void setMinInsertTime(Date minInsertTime) {
		this.minInsertTime = minInsertTime;
	}
	public Date getMaxInsertTime() {
		return maxInsertTime;
	}
	public void setMaxInsertTime(Date maxInsertTime) {
		this.maxInsertTime = maxInsertTime;
	}
	public Date getMinUpdateTime() {
		return minUpdateTime;
	}
	public void setMinUpdateTime(Date minUpdateTime) {
		this.minUpdateTime = minUpdateTime;
	}
	public Date getMaxUpdateTime() {
		return maxUpdateTime;
	}
	public void setMaxUpdateTime(Date maxUpdateTime) {
		this.maxUpdateTime = maxUpdateTime;
	}
	
    
}
