package com.xiciwutong.service.impl;

import com.xiciwutong.dao.PhoneDao;
import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.PhoneDto;
import com.xiciwutong.model.PhoneModel;
import com.xiciwutong.model.PhoneQueryModel;
import com.xiciwutong.service.PhoneService;
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
public class PhoneServiceImpl extends BasePaginatingServiceImpl<PhoneDto, PhoneQueryModel>
        implements PhoneService<PhoneDto, PhoneQueryModel> {

    private Logger logger = LoggerFactory.getLogger(getClass());


    private PhoneDao phoneDao;
    @Autowired
    public PhoneServiceImpl(PhoneDao dao) {
        super(dao);
        this.phoneDao = dao;
    }


    @Override
    public PagingResultDto<PhoneDto> list(PhoneModel model) {
        Integer lineNo = (model.getPageNo() -1) * model.getPageSize();
        List<PhoneDto> list = phoneDao.list(lineNo, model.getPageSize(), model);
        Long total = phoneDao.count(model);
        PagingResultDto<PhoneDto> resultDto = new PagingResultDto<>();
        resultDto.setContent(list);
        resultDto.setTotal(total);
        resultDto.setPageNo(model.getPageNo());
        resultDto.setPageSize(model.getPageSize());
        return resultDto;
    }
}
