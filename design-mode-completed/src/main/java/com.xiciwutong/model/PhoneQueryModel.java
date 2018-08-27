package com.xiciwutong.model;

import java.math.BigDecimal;

/**
 * @Author: wutong
 * @date: 2018-8-27
 */
public class PhoneQueryModel {

    private String name;

    private String brand;

    private BigDecimal size;

    private String operatingSystem;

    private BigDecimal price;

    @Override
    public String toString() {
        return "PhoneQueryModel{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
