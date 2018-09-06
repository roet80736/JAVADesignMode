package com.xiciwutong.model;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@ApiModel(description = "手机列表查询条件")
public class PhoneModel extends PagingModel {

    private String name;

    private String brand;

    private BigDecimal size;

    private String operatingSystem;

    private BigDecimal price;

    @Override
    public String toString() {
        return "PhoneModel{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", price=" + price + super.toString() +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
