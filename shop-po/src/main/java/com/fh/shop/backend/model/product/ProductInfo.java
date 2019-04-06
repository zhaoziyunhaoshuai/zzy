/** 
 * <pre>项目名称:homeWork 
 * 文件名称:ProductInfo.java 
 * 包名:com.fh.shop.backend.po.product 
 * 创建日期:2019年1月26日下午7:41:36 
 * Copyright (c) 2019, xxxxxx@163.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.backend.model.product;

import org.fh.shop.admin.zc.model.Page;
import org.fh.shop.admin.zc.model.brand.BrandInfo;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/** 
 * <pre>项目名称：homeWork    
 * 类名称：ProductInfo    
 * 类描述：    
 * 创建人：赵晨 786071823@qq.com    
 * 创建时间：2019年1月26日 下午7:41:36    
 * 修改人：赵晨 786071823@qq.com     
 * 修改时间：2019年1月26日 下午7:41:36    
 * 修改备注：       
 * @version </pre>    
 */
public class ProductInfo extends Page implements Serializable{

	private static final long serialVersionUID = -5491449936350432370L;
	//id,商品名，品牌id,店铺id,商品成本价，商品销售价，商品库存，商品推荐【0：否 1：是】,
	private int id;
	private String productName;
	private BrandInfo brandId;
	private Double costPrice;
	private Double sellingPirce;
	private Integer stock;
	private Integer recommend;
	private Date entryTime;
	private String entryTimeStr;
	private Date updateTime;
	private String updateTimeStr;
    private Double minCostPrice;
    private Double maxCostPrice;
    private Double minSellingPirce;
    private Double maxSellingPirce;
    private Integer minStock;
    private Integer maxStock;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date minEntryTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date maxEntryTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH")
    private Date minUpdateTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH")
    private Date maxUpdateTime;
    private String productImagePath;
    private String childImagePath;
    private String oldProductImagePath;

	public String getOldProductImagePath() {
		return oldProductImagePath;
	}

	public void setOldProductImagePath(String oldProductImagePath) {
		this.oldProductImagePath = oldProductImagePath;
	}

	public String getChildImagePath() {
		return childImagePath;
	}

	public void setChildImagePath(String childImagePath) {
		this.childImagePath = childImagePath;
	}

	public String getEntryTimeStr() {
		return entryTimeStr;
	}

	public void setEntryTimeStr(String entryTimeStr) {
		this.entryTimeStr = entryTimeStr;
	}

	public String getUpdateTimeStr() {
		return updateTimeStr;
	}

	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}

	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

	public BrandInfo getBrandId() {
		return brandId;
	}
	public void setBrandId(BrandInfo brandId) {
		this.brandId = brandId;
	}
	public Double getMinCostPrice() {
		return minCostPrice;
	}
	public void setMinCostPrice(Double minCostPrice) {
		this.minCostPrice = minCostPrice;
	}
	public Double getMaxCostPrice() {
		return maxCostPrice;
	}
	public void setMaxCostPrice(Double maxCostPrice) {
		this.maxCostPrice = maxCostPrice;
	}
	public Double getMinSellingPirce() {
		return minSellingPirce;
	}
	public void setMinSellingPirce(Double minSellingPirce) {
		this.minSellingPirce = minSellingPirce;
	}
	public Double getMaxSellingPirce() {
		return maxSellingPirce;
	}
	public void setMaxSellingPirce(Double maxSellingPirce) {
		this.maxSellingPirce = maxSellingPirce;
	}
	public Integer getMinStock() {
		return minStock;
	}
	public void setMinStock(Integer minStock) {
		this.minStock = minStock;
	}
	public Integer getMaxStock() {
		return maxStock;
	}
	public void setMaxStock(Integer maxStock) {
		this.maxStock = maxStock;
	}
	public Date getMinEntryTime() {
		return minEntryTime;
	}
	public void setMinEntryTime(Date minEntryTime) {
		this.minEntryTime = minEntryTime;
	}
	public Date getMaxEntryTime() {
		return maxEntryTime;
	}
	public void setMaxEntryTime(Date maxEntryTime) {
		this.maxEntryTime = maxEntryTime;
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
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	public Double getSellingPirce() {
		return sellingPirce;
	}
	public void setSellingPirce(Double sellingPirce) {
		this.sellingPirce = sellingPirce;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getRecommend() {
		return recommend;
	}
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	
	

}
