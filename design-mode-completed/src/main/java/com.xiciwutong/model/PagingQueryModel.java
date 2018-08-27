package com.xiciwutong.model;

import io.swagger.annotations.ApiModelProperty;


/**
 * @Author: wutong
 * @date: 2018-8-27
 */
public class PagingQueryModel<T> {

    @ApiModelProperty(required = true, value = "数据分页需要返回的当前页,从1开始,参数大于等于1", example = "1",position = 1)
    private Integer pageNo;

    @ApiModelProperty(required = true, value = "分页时,每一页的记录数,参数大于等于1", example = "2",position = 2)
    private Integer pageSize;

    @ApiModelProperty(required = true, value = "查询条件", position = 3)
    private T t;

    @Override
    public String toString() {
        return "PagingQueryModel{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", t=" + t +
                '}';
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
