package com.ruoyi.ztdagl.mapper;

import java.util.List;
import com.ruoyi.ztdagl.domain.YwYwzsk;

/**
 * 业务知识库Mapper接口
 * 
 * @author zht
 * @date 2022-07-14
 */
public interface YwYwzskMapper 
{
    /**
     * 查询业务知识库
     * 
     * @param recid 业务知识库主键
     * @return 业务知识库
     */
    public YwYwzsk selectYwYwzskByRecid(String recid);

    /**
     * 查询业务知识库列表
     * 
     * @param ywYwzsk 业务知识库
     * @return 业务知识库集合
     */
    public List<YwYwzsk> selectYwYwzskList(YwYwzsk ywYwzsk);

    /**
     * 新增业务知识库
     * 
     * @param ywYwzsk 业务知识库
     * @return 结果
     */
    public int insertYwYwzsk(YwYwzsk ywYwzsk);

    /**
     * 修改业务知识库
     * 
     * @param ywYwzsk 业务知识库
     * @return 结果
     */
    public int updateYwYwzsk(YwYwzsk ywYwzsk);

    /**
     * 删除业务知识库
     * 
     * @param recid 业务知识库主键
     * @return 结果
     */
    public int deleteYwYwzskByRecid(String recid);

    /**
     * 批量删除业务知识库
     * 
     * @param recids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteYwYwzskByRecids(String[] recids);
}
