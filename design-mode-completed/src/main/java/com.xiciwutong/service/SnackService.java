package com.xiciwutong.service;

import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.SnackAdapterDto;
import com.xiciwutong.dto.SnackDto;
import com.xiciwutong.model.PagingQueryModel;
import com.xiciwutong.model.SnackModel;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
public interface SnackService<D, M> extends PaginatingService<D, M> {

    /**
     *
     * @return 查询零食列表
     */
    PagingResultDto<SnackDto> list(SnackModel model);

    /**
     *
     * @return 适配器模式的分页查询
     */
    PagingResultDto<SnackAdapterDto> adapterPaginate(PagingQueryModel<M> model);
}
