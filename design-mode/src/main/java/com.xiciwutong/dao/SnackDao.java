package com.xiciwutong.dao;

import com.xiciwutong.dto.SnackDto;
import com.xiciwutong.model.SnackModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@Repository
public interface SnackDao {

    /**
     *
     * @return 查询分页信息
     */
    List<SnackDto> list(@Param("lineNo") Integer lineNo,
                        @Param("pageSize") Integer pageSize,
                        @Param("model") SnackModel model);

    /**
     *
     * @return 查询分页的总条数
     */
    Long count(@Param("model") SnackModel model);
}
