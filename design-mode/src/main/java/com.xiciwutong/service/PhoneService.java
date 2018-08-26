package com.xiciwutong.service;

import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.PhoneDto;
import com.xiciwutong.model.PhoneModel; /**
 * @Author: wutong
 * @date: 2018-8-26
 */
public interface PhoneService {

    /**
     *
     * @return 查询手机列表
     */
    PagingResultDto<PhoneDto> list(PhoneModel model);
}
