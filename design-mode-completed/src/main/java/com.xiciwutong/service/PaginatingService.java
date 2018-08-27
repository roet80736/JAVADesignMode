package com.xiciwutong.service;


import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.model.PagingQueryModel;

/**
 * @Author: wutong
 * @date: 2018-8-27
 */
public interface PaginatingService<D, M> {

    PagingResultDto<D> paginate(PagingQueryModel<M> model);

}
