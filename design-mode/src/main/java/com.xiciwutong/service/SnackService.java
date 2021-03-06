package com.xiciwutong.service;

import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.SnackDto;
import com.xiciwutong.model.SnackModel;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
public interface SnackService {

    /**
     *
     * @return 查询零食列表
     */
    PagingResultDto<SnackDto> list(SnackModel model);
}
