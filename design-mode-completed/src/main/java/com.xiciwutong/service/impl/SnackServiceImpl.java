package com.xiciwutong.service.impl;

import com.xiciwutong.dao.PaginatingDao;
import com.xiciwutong.dao.SnackDao;
import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.SnackAdapterDto;
import com.xiciwutong.dto.SnackDto;
import com.xiciwutong.model.PagingQueryModel;
import com.xiciwutong.model.SnackModel;
import com.xiciwutong.model.SnackQueryModel;
import com.xiciwutong.service.SnackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@Service
public class SnackServiceImpl extends BasePaginatingService<SnackDto, SnackQueryModel>
        implements SnackService<SnackDto, SnackQueryModel> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private SnackDao snackDao;

    @Autowired
    public SnackServiceImpl(SnackDao dao) {
        super(dao);
        this.snackDao = dao;
    }

    private class AdapterSnackDao implements PaginatingDao<SnackAdapterDto, SnackQueryModel> {

        @Override
        public Long total(SnackQueryModel model) {
            return snackDao.total(model);
        }
        @Override
        public List<SnackAdapterDto> pagingQuery(Integer lineNo, Integer pageSize, SnackQueryModel model) {
            return snackDao.adapterPagingQuery(lineNo, pageSize, model);
        }
    }

    @Override
    public PagingResultDto<SnackDto> list(SnackModel model) {
        Integer lineNo = (model.getPageNo() -1) * model.getPageSize();
        List<SnackDto> list = snackDao.list(lineNo, model.getPageSize(), model);
        Long total = snackDao.count(model);
        PagingResultDto<SnackDto> resultDto = new PagingResultDto<>();
        resultDto.setContent(list);
        resultDto.setTotal(total);
        resultDto.setPageNo(model.getPageNo());
        resultDto.setPageSize(model.getPageSize());
        return resultDto;
    }

    /**
     *
     * @return 适配器模式
     */
    @Override
    public PagingResultDto<SnackAdapterDto> adapterPaginate(PagingQueryModel<SnackQueryModel> model) {
        BasePaginatingService<SnackAdapterDto, SnackQueryModel> service = new BasePaginatingService<>(new AdapterSnackDao());
        return service.paginate(model);
    }
}
