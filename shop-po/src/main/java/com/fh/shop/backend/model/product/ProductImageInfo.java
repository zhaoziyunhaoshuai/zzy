package com.fh.shop.backend.model.product;

import java.io.Serializable;

public class ProductImageInfo implements Serializable {
    private static final long serialVersionUID = -5695089206656177976L;
    private int id;
    private String imagePath;
    private Integer productId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
