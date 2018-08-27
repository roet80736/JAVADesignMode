package com.xiciwutong.service;

import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.PhoneDto;
import com.xiciwutong.model.PhoneModel;
import com.xiciwutong.service.impl.BasePaginatingServiceImpl;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
public interface PhoneService<D, M> extends PaginatingService<D, M> {

    /**
     *
     * @return 查询手机列表
     */
    PagingResultDto<PhoneDto> list(PhoneModel model);
}
