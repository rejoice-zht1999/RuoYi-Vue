package com.ruoyi.ztdagl.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.ruoyi.ztdagl.domain.VYwZtdaglJbxx;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 主体信息Mapper接口
 *
 * @author zht
 * @date 2022-07-13
 */
public interface VYwZtdaglJbxxMapper extends BaseMapper<VYwZtdaglJbxx> {

    @Select("select * from v_yw_ztdagl_jbxx " +
            "${ew.customSqlSegment}")
    List<VYwZtdaglJbxx> queryList(@Param(Constants.WRAPPER) LambdaQueryWrapper<VYwZtdaglJbxx> lqw);
}
