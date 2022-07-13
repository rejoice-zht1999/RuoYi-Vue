package com.ruoyi.ztdagl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 主体信息对象 v_yw_ztdagl_jbxx
 *
 * @author zht
 * @date 2022-07-04
 */
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Accessors(chain = true)
public class VYwZtdaglJbxx implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 档案主键
     */
    @Excel(name = "档案主键")
    @TableId(value = "recid", type = IdType.INPUT)
    private String recid;

    /**
     * 主体内部序号，关联企业
     */
    @Excel(name = "主体内部序号，关联企业")
    private String pripid;

    /**
     * 监管主体类型（备用字段 YD：药店）
     */
    @Excel(name = "监管主体类型")
    private String zttype;

    /**
     * 药店类型 连锁、总部、单体
     */
    @Excel(name = "药店类型")
    private String ydType;

    /**
     * 药店风险等级 ABCD
     */
    @Excel(name = "药店风险等级")
    private String riskLevel;

    /**
     * 主体联络人
     */
    @Excel(name = "主体联络人")
    private String llr;

    /**
     * 主体联络人电话
     */
    @Excel(name = "主体联络人电话")
    private String llrTel;

    /**
     * 监管单位
     */
    @Excel(name = "监管单位")
    private String jgorg;

    /**
     * 监管单位
     */
    @Excel(name = "监管单位")
    private String jgorgName;

    /**
     * 监管所或监管部门
     */
    @Excel(name = "监管所或监管部门")
    private String jgs;

    /**
     * 监管所或监管部门
     */
    @Excel(name = "监管所或监管部门")
    private String jgsName;

    /**
     * 监管网格
     */
    @Excel(name = "监管网格")
    private String jggrid;

    /**
     * 网格员
     */
    @Excel(name = "网格员")
    private String jgoperName;

    /**
     * 坐标经度
     */
    @Excel(name = "坐标经度")
    private String lng;

    /**
     * 坐标纬度
     */
    @Excel(name = "坐标纬度")
    private String lat;

    /**
     * 坐标状态 0模糊定位，1精准定位
     */
    @Excel(name = "坐标状态 0模糊定位，1精准定位")
    private String locstatus;

    /**
     * 地图显示等级，等级10-17
     */
    private Long mapGrade;

    /**
     * 药店状态0正常营业 2停业
     */
    @Excel(name = "药店状态0正常营业 2停业")
    private String ydStatus;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//json转实体类
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//实体类转json
    private Date createTime;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//json转实体类
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//实体类转json
    private Date updateTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 注册号
     */
    @Excel(name = "注册号")
    private String regno;

    /**
     * 统一社会信用代码
     */
    @Excel(name = "统一社会信用代码")
    private String uniscid;

    /**
     * 名称
     */
    @Excel(name = "名称")
    private String entname;

    /**
     * 法定代表人/负责人
     */
    @Excel(name = "法定代表人/负责人")
    private String lerep;

    /**
     * 企业类别
     */
    @Excel(name = "企业类别")
    private String entcat;

    /**
     * 企业类别名称
     */
    @Excel(name = "企业类别名称")
    private String entcatName;

    /**
     * 企业类型
     */
    @Excel(name = "企业类型")
    private String enttype;

    /**
     * 企业类型名称
     */
    @Excel(name = "企业类型名称")
    private String enttypeName;

    /**
     * 行业门类
     */
    @Excel(name = "行业门类")
    private String industryphy;

    /**
     * 行业门类名称
     */
    @Excel(name = "行业门类名称")
    private String industryphyName;

    /**
     * 行业代码
     */
    @Excel(name = "行业代码")
    private String industryco;

    /**
     * 行业代码名称
     */
    @Excel(name = "行业代码名称")
    private String industrycoName;

    /**
     * 成立日期
     */
    @Excel(name = "成立日期", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date estdate;

    /**
     * 状态
     */
    @Excel(name = "状态")
    private BigDecimal entstatus;

    /**
     * 企业状态名称
     */
    @Excel(name = "企业状态名称")
    private String entstatusName;

    /**
     * 经营期限起
     */
    @Excel(name = "经营期限起", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date opfrom;

    /**
     * 经营期限止
     */
    @Excel(name = "经营期限止", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date opto;

    /**
     * 地址
     */
    @Excel(name = "地址")
    private String dom;

    /**
     * 法定代表人证件号码
     */
    @Excel(name = "法定代表人证件号码")
    private String cerno;

    /**
     * 经营范围
     */
    @Excel(name = "经营范围")
    private String busscope;

    /**
     * 时间戳
     */
    @Excel(name = "时间戳", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//实体类转json
    private Date sExtTimestamp;

    /**
     * 对接视频
     */
    @Excel(name = "对接视频")
    private String indexCode;

    /**
     * 距离
     */
    @TableField(exist = false)
    private String distance;
}
