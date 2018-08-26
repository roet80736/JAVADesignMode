package com.xiciwutong.controller;

import com.xiciwutong.dto.PagingResultDto;
import com.xiciwutong.dto.SnackDto;
import com.xiciwutong.model.SnackModel;
import com.xiciwutong.service.SnackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@RestController
@RequestMapping(value = "/snack/")
@Api(tags = {"designMode - snack"}, description = "零食信息相关接口")
public class SnackController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SnackService snackService;

    @ApiOperation(nickname = "list", value = "查询零食列表", notes = "查询零食列表")
    @PostMapping(value = "/list")
    public PagingResultDto<SnackDto> list(@RequestBody SnackModel model) {
        logger.info("list 接口传入参数:{}", model);
        return snackService.list(model);

    }
}
