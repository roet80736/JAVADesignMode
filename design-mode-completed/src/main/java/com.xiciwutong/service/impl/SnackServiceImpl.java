package com.xiciwutong.service.impl;

import com.xiciwutong.dao.SnackDao;
import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.SnackDto;
import com.xiciwutong.model.SnackModel;
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
public class SnackServiceImpl implements SnackService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SnackDao snackDao;

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
}
