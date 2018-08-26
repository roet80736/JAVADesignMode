package com.xiciwutong.dto;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@ApiModel(description = "零食分页信息返回对象")
public class SnackDto {

    private Long id;

    private String name;

    private String brand;

    private String taste;

    private BigDecimal price;

    private String pack;

    private String province;

    @Override
    public String toString() {
        return "SnackDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", taste='" + taste + '\'' +
                ", price=" + price +
                ", pack='" + pack + '\'' +
                ", province='" + province + '\'' +
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

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
