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
     * 主体联络人
     */
    @Excel(name = "主体联络人")
    private String ztllr;

    /**
     * 主体联络人电话
     */
    @Excel(name = "主体联络人电话")
    private String ztllrtel;

    /**
     * 监管单位
     */
    @Excel(name = "监管单位")
    private String jgorg;

    /**
     * 监管所
     */
    @Excel(name = "监管所")
    private String jggss;

    /**
     * 监管网格
     */
    @Excel(name = "监管网格")
    private String jggrid;

    /**
     * 药店类型 连锁、总部、单体
     */
    @Excel(name = "药店类型")
    private String ydType;

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
     * 监管网格id
     */
    @Excel(name = "监管网格id")
    private String licno;

    /**
     * 统一社会信用代码
     */
    @Excel(name = "统一社会信用代码")
    private String uniscid;

    /**
     * 主体名称
     */
    @Excel(name = "主体名称")
    private String entname;

    /**
     * 注册地址
     */
    @Excel(name = "注册地址")
    private String zcDom;

    /**
     * 法定代表人/负责人
     */
    @Excel(name = "法定代表人/负责人")
    private String lerep;

    /**
     * 企业负责人
     */
    @Excel(name = "企业负责人")
    private String fzrQy;

    /**
     * 质量负责人
     */
    @Excel(name = "质量负责人")
    private String fzrZl;

    /**
     * 仓库地址
     */
    @Excel(name = "仓库地址")
    private String ckDom;

    /**
     * 经营方式
     */
    @Excel(name = "经营方式")
    private String jyfs;

    /**
     * 经营范围
     */
    @Excel(name = "经营范围")
    private String busscope;

    /**
     * 发证机关编码
     */
    @Excel(name = "发证机关编码")
    private String licanth;

    /**
     * 发证机关名称
     */
    @Excel(name = "发证机关名称")
    private String licanthName;

    /**
     * 发证日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//json转实体类
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//实体类转json
    @Excel(name = "发证日期")
    private Date valfrom;

    /**
     * 有效期至
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//json转实体类
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//实体类转json
    @Excel(name = "有效期至")
    private Date valto;

    /**
     * 证书状态
     */
    @Excel(name = "证书状态")
    private String licstate;

    /**
     * 组织机构代码
     */
    @Excel(name = "组织机构代码")
    private String orgcode;

    /**
     * 行政区划
     */
    @Excel(name = "行政区划")
    private String xzqhCode;

    /**
     * 行政区划名称
     */
    @Excel(name = "行政区划名称")
    private String xzqhName;

    /**
     * 经营类别编号
     */
    @Excel(name = "经营类别编号")
    private String jyTypeCode;

    /**
     * 经营类别名称
     */
    @Excel(name = "经营类别名称")
    private String jyTypeName;

    /**
     * 证照类别
     */
    @Excel(name = "证照类别")
    private String licType;

    /**
     * 企业类别
     */
    @Excel(name = "企业类别")
    private String qytype;

    /**
     * 时间戳
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//json转实体类
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//实体类转json
    @Excel(name = "时间戳")
    private Date gxDate;

    /**
     * 身份证号码
     */
    @Excel(name = "身份证号码")
    private String cerno;

}
