package com.xiciwutong.dao;

import com.xiciwutong.dto.PhoneDto;
import com.xiciwutong.model.PhoneModel;
import com.xiciwutong.model.PhoneQueryModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@Repository
public interface PhoneDao extends PaginatingDao<PhoneDto, PhoneQueryModel> {

    /**
     *
     * @return 查询手机信息列表
     */
    List<PhoneDto> list(@Param("lineNo") Integer lineNo,
                        @Param("pageSize") Integer pageSize,
                        @Param("model") PhoneModel model);

    /**
     *
     * @return 查询分页的总条数
     */
    Long count(@Param("model") PhoneModel model);
}
