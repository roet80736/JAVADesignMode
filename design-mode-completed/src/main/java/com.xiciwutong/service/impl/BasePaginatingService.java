package com.xiciwutong.service.impl;

import com.xiciwutong.dao.PaginatingDao;
import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.model.PagingQueryModel;
import com.xiciwutong.service.PaginatingService;

import java.util.List;

/**
 * @Author: wutong
 * @date: 2018-8-27
 */
public class BasePaginatingService<D, M> implements PaginatingService<D, M> {


    private PaginatingDao<D, M> dao;

    public BasePaginatingService(PaginatingDao<D, M> dao) {
        this.dao = dao;
    }

    /**
     * dao层默认调用分页方法
     * 子类覆盖此方法时，可校验查询条件，比如检查某个必须的条件是否存在；根据sql需要对条件进行规范化处理，比如处理时间类型的条件
     * @param model 分页参数
     * @return 分页查询返回的结构集
     */
    @Override
    public PagingResultDto<D> paginate(PagingQueryModel<M> model) {
        PagingResultDto<D> pagingResultDto = getPagingQueryResultDto(model);
        if (pagingResultDto.getTotal() == 0) {
            return pagingResultDto;
        }
        Integer lineNo = (model.getPageNo() - 1) * model.getPageSize();
        List<D> list = dao.pagingQuery(lineNo, model.getPageSize(), model.getT());
        pagingResultDto.setContent(list);
        return pagingResultDto;
    }

    /**
     *
     * @param model 分页参数
     * @return 组装分页结果集中的固定参数
     */
    private PagingResultDto<D> getPagingQueryResultDto(PagingQueryModel<M> model) {
        PagingResultDto<D> pagingQueryResultDto = new PagingResultDto<>();
        pagingQueryResultDto.setTotal(dao.total(model.getT()));
        pagingQueryResultDto.setPageNo(model.getPageNo());
        pagingQueryResultDto.setPageSize(model.getPageSize());
        return pagingQueryResultDto;
    }
}
