package com.ruoyi.ztdagl.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.ztdagl.domain.VYwZtdaglJbxx;
import com.ruoyi.ztdagl.service.IVYwZtdaglJbxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 主体信息Controller
 *
 * @author zht
 * @date 2022-07-04
 */
@RestController
@RequestMapping("/dagl/vztxx")
public class VYwZtdaglJbxxController extends BaseController {

    @Autowired
    private IVYwZtdaglJbxxService iVYwZtdaglJbxxService;

    /**
     * 查询主体信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(VYwZtdaglJbxx vYwZtdaglJbxx) {
        LambdaQueryWrapper<VYwZtdaglJbxx> lqw = new LambdaQueryWrapper<VYwZtdaglJbxx>();
        if (StringUtils.isNotBlank(vYwZtdaglJbxx.getUniscid())) {
            lqw.like(VYwZtdaglJbxx::getUniscid, vYwZtdaglJbxx.getUniscid());
        }
        if (StringUtils.isNotBlank(vYwZtdaglJbxx.getEntname())) {
            lqw.like(VYwZtdaglJbxx::getEntname, vYwZtdaglJbxx.getEntname());
        }
        startPage();
        List<VYwZtdaglJbxx> list = iVYwZtdaglJbxxService.list(lqw);
        return getDataTable(list);
    }

}
