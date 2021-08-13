package com.definesys.demo.domain;


import java.util.Date;

import com.definesys.mpaas.query.annotation.Column;
import com.definesys.mpaas.query.annotation.Table;
import com.definesys.mpaas.query.model.MpaasBasePojo;
import lombok.Data;

/**
 * 
 * @TableName MDB_MOVIE
 */
@Table(value="MDB_MOVIE")
@Data
public class MdbMovie extends MpaasBasePojo  {
    /**
     * 主键
     */

    @Column(value = "ID")
    private Long id;

    /**
     * 电影名称
     */
    @Column(value = "NAME")
    private String name;

    /**
     * 上映日期
     */
    @Column(value = "SHOW_DATE")
    private Date showDate;

    /**
     * 评分数
     */
    @Column(value = "STAR")
    private Long star;

    /**
     * 类型
     */
    @Column(value = "TYPE")
    private String type;

    /**
     * 国家
     */
    @Column(value = "NATIONAL")
    private String national;

    /**
     * 语言
     */
    @Column(value = "LANGUAGE")
    private String language;

    /**
     * 头像图片id
     */
    @Column(value = "AVATAR")
    private Long avatar;

    /**
     * 系统字段-版本号
     */
    @Column(value = "OBJECT_VERSION_NUMBER")
    private Long objectVersionNumber;

    /**
     * 系统字段-创建人
     */
    @Column(value = "CREATED_BY")
    private String createdBy;

    /**
     * 系统字段-创建日期
     */
    @Column(value = "CREATION_DATE")
    private Date creationDate;

    /**
     * 系统字段-最后更新人
     */
    @Column(value = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    /**
     * 系统字段-最后更新日期
     */
    @Column(value = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

}