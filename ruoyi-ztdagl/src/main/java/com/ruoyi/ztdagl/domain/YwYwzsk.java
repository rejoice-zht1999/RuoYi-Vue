package com.ruoyi.ztdagl.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 业务知识库对象 yw_ywzsk
 * 
 * @author zht
 * @date 2022-07-14
 */
public class YwYwzsk extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String recid;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /** 是否发布：1是，2否 */
    @Excel(name = "是否发布：1是，2否")
    private String isRelease;

    /** 附件id */
    @Excel(name = "附件id")
    private String attachmentId;

    /** 单位机关 */
    @Excel(name = "单位机关")
    private String deptCode;

    /** 单位级别：1省，2市，3区，4所 */
    @Excel(name = "单位级别：1省，2市，3区，4所")
    private String deptLevel;

    public void setRecid(String recid) 
    {
        this.recid = recid;
    }

    public String getRecid() 
    {
        return recid;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setReleaseTime(Date releaseTime) 
    {
        this.releaseTime = releaseTime;
    }

    public Date getReleaseTime() 
    {
        return releaseTime;
    }
    public void setIsRelease(String isRelease) 
    {
        this.isRelease = isRelease;
    }

    public String getIsRelease() 
    {
        return isRelease;
    }
    public void setAttachmentId(String attachmentId) 
    {
        this.attachmentId = attachmentId;
    }

    public String getAttachmentId() 
    {
        return attachmentId;
    }
    public void setDeptCode(String deptCode) 
    {
        this.deptCode = deptCode;
    }

    public String getDeptCode() 
    {
        return deptCode;
    }
    public void setDeptLevel(String deptLevel) 
    {
        this.deptLevel = deptLevel;
    }

    public String getDeptLevel() 
    {
        return deptLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recid", getRecid())
            .append("title", getTitle())
            .append("content", getContent())
            .append("releaseTime", getReleaseTime())
            .append("isRelease", getIsRelease())
            .append("attachmentId", getAttachmentId())
            .append("deptCode", getDeptCode())
            .append("deptLevel", getDeptLevel())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
