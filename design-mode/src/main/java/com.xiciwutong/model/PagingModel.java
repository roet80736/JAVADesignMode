package com.xiciwutong.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@ApiModel(description = "分页查询公共参数")
public class PagingModel {

    @ApiModelProperty(required = true, value = "数据分页需要返回的当前页,从1开始,参数大于等于1", example = "1",position = 1)
    private Integer pageNo;

    @ApiModelProperty(required = true, value = "分页时,每一页的记录数,参数大于等于1", example = "2",position = 2)
    private Integer pageSize;

    @Override
    public String toString() {
        return "PagingModel{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
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
}
