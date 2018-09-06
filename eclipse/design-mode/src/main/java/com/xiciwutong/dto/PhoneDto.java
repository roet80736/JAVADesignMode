package com.xiciwutong.dto;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@ApiModel(description = "手机分页信息返回对象")
public class PhoneDto {

    private Long id;

    private String name;

    private String brand;

    private BigDecimal size;

    private String operatingSystem;

    private BigDecimal price;

    @Override
    public String toString() {
        return "PhoneDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
