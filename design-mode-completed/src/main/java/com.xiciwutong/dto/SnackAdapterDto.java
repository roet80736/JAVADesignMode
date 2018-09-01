package com.xiciwutong.dto;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@ApiModel(description = "零食分页信息返回对象3")
public class SnackAdapterDto {

    private Long id;

    private String name;

    private String brand;

    private String pack;

    private String province;

    @Override
    public String toString() {
        return "SnackDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
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
