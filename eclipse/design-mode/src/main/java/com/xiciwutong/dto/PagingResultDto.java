package com.xiciwutong.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@ApiModel(description = "分页查询结果集")
public class PagingResultDto<T> {

    @ApiModelProperty(required = true, value = "当前页数", position = 1)
    private Integer pageNo;
    @ApiModelProperty(required = true, value = "当前分页大小", position = 2)
    private Integer pageSize;
    @ApiModelProperty(required = true, value = "总行数", position = 3)
    private Long total;
    @ApiModelProperty(required = true, value = "分页内容", position = 4)
    private List<T> content = new ArrayList<>();

    @Override
    public String toString() {
        return "PagingResultDto{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", content=" + content +
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
