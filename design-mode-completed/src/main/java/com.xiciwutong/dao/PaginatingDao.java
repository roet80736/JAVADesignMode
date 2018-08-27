package com.xiciwutong.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wutong
 * @date: 2018-8-27
 */
public interface PaginatingDao<D, M> {

    /**
     *
     * @param t 查询条件
     * @return 条数
     */
    Long total(@Param("model") M t);

    /**
     *
     * @return 根据条件查询分页列表
     */
    List<D> pagingQuery(@Param("lineNo") Integer lineNo,
                        @Param("pageSize") Integer pageSize,
                        @Param("model") M t);
}
