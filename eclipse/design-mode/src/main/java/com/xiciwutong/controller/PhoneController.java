package com.xiciwutong.controller;

import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.PhoneDto;
import com.xiciwutong.model.PhoneModel;
import com.xiciwutong.service.PhoneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @Author: wutong
 * @date: 2018-8-26
 * 手机信息相关接口
 */
@RestController
@RequestMapping(value = "/phone/")
@Api(tags = {"designMode - phone"}, description = "手机信息相关接口")
public class PhoneController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PhoneService phoneService;


    @ApiOperation(nickname = "list", value = "查询手机列表", notes = "查询手机列表")
    @PostMapping(value = "/list")
    public PagingResultDto<PhoneDto> list(@RequestBody PhoneModel model) {
        logger.info("list 接口传入参数:{}", model);
        return phoneService.list(model);

    }

}
