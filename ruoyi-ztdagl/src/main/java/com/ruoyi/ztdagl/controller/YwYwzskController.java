package com.ruoyi.ztdagl.controller;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.uuid.IdUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.ztdagl.domain.YwYwzsk;
import com.ruoyi.ztdagl.service.IYwYwzskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 业务知识库Controller
 *
 * @author zht
 * @date 2022-07-14
 */
@RestController
@RequestMapping("/ztdagl/ywzsk")
public class YwYwzskController extends BaseController {
    @Autowired
    private IYwYwzskService ywYwzskService;

    /**
     * 查询业务知识库列表
     */
    @PreAuthorize("@ss.hasPermi('ztdagl:ywzsk:list')")
    @GetMapping("/list")
    public TableDataInfo list(YwYwzsk ywYwzsk) {
        startPage();
        List<YwYwzsk> list = ywYwzskService.selectYwYwzskList(ywYwzsk);
        return getDataTable(list);
    }

    /**
     * 导出业务知识库列表
     */
    @PreAuthorize("@ss.hasPermi('ztdagl:ywzsk:export')")
    @Log(title = "业务知识库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, YwYwzsk ywYwzsk) {
        List<YwYwzsk> list = ywYwzskService.selectYwYwzskList(ywYwzsk);
        ExcelUtil<YwYwzsk> util = new ExcelUtil<YwYwzsk>(YwYwzsk.class);
        util.exportExcel(response, list, "业务知识库数据");
    }

    /**
     * 获取业务知识库详细信息
     */
    @PreAuthorize("@ss.hasPermi('ztdagl:ywzsk:query')")
    @GetMapping(value = "/{recid}")
    public AjaxResult getInfo(@PathVariable("recid") String recid) {
        return AjaxResult.success(ywYwzskService.selectYwYwzskByRecid(recid));
    }

    /**
     * 新增业务知识库
     */
    @PreAuthorize("@ss.hasPermi('ztdagl:ywzsk:add')")
    @Log(title = "业务知识库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody YwYwzsk ywYwzsk) {
        Instant now = Instant.now();
        ywYwzsk.setRecid(IdUtils.fastSimpleUUID());
        ywYwzsk.setCreateTime(Date.from(now));
        ywYwzsk.setUpdateTime(Date.from(now));
        return toAjax(ywYwzskService.insertYwYwzsk(ywYwzsk));
    }

    /**
     * 修改业务知识库
     */
    @PreAuthorize("@ss.hasPermi('ztdagl:ywzsk:edit')")
    @Log(title = "业务知识库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody YwYwzsk ywYwzsk) {
        return toAjax(ywYwzskService.updateYwYwzsk(ywYwzsk));
    }

    /**
     * 删除业务知识库
     */
    @PreAuthorize("@ss.hasPermi('ztdagl:ywzsk:remove')")
    @Log(title = "业务知识库", businessType = BusinessType.DELETE)
    @DeleteMapping("/{recids}")
    public AjaxResult remove(@PathVariable String[] recids) {
        return toAjax(ywYwzskService.deleteYwYwzskByRecids(recids));
    }
}
