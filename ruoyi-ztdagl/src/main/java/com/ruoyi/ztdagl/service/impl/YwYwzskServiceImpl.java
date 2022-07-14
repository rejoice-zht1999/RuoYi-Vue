package com.ruoyi.ztdagl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ztdagl.mapper.YwYwzskMapper;
import com.ruoyi.ztdagl.domain.YwYwzsk;
import com.ruoyi.ztdagl.service.IYwYwzskService;

/**
 * 业务知识库Service业务层处理
 * 
 * @author zht
 * @date 2022-07-14
 */
@Service
public class YwYwzskServiceImpl implements IYwYwzskService 
{
    @Autowired
    private YwYwzskMapper ywYwzskMapper;

    /**
     * 查询业务知识库
     * 
     * @param recid 业务知识库主键
     * @return 业务知识库
     */
    @Override
    public YwYwzsk selectYwYwzskByRecid(String recid)
    {
        return ywYwzskMapper.selectYwYwzskByRecid(recid);
    }

    /**
     * 查询业务知识库列表
     * 
     * @param ywYwzsk 业务知识库
     * @return 业务知识库
     */
    @Override
    public List<YwYwzsk> selectYwYwzskList(YwYwzsk ywYwzsk)
    {
        return ywYwzskMapper.selectYwYwzskList(ywYwzsk);
    }

    /**
     * 新增业务知识库
     * 
     * @param ywYwzsk 业务知识库
     * @return 结果
     */
    @Override
    public int insertYwYwzsk(YwYwzsk ywYwzsk)
    {
        ywYwzsk.setCreateTime(DateUtils.getNowDate());
        return ywYwzskMapper.insertYwYwzsk(ywYwzsk);
    }

    /**
     * 修改业务知识库
     * 
     * @param ywYwzsk 业务知识库
     * @return 结果
     */
    @Override
    public int updateYwYwzsk(YwYwzsk ywYwzsk)
    {
        ywYwzsk.setUpdateTime(DateUtils.getNowDate());
        return ywYwzskMapper.updateYwYwzsk(ywYwzsk);
    }

    /**
     * 批量删除业务知识库
     * 
     * @param recids 需要删除的业务知识库主键
     * @return 结果
     */
    @Override
    public int deleteYwYwzskByRecids(String[] recids)
    {
        return ywYwzskMapper.deleteYwYwzskByRecids(recids);
    }

    /**
     * 删除业务知识库信息
     * 
     * @param recid 业务知识库主键
     * @return 结果
     */
    @Override
    public int deleteYwYwzskByRecid(String recid)
    {
        return ywYwzskMapper.deleteYwYwzskByRecid(recid);
    }
}
