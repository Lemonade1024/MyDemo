package com.definesys.demo.pojo;

import java.io.Serializable;
import java.util.Date;

import com.definesys.mpaas.query.annotation.Column;
import com.definesys.mpaas.query.annotation.RowID;
import com.definesys.mpaas.query.annotation.Table;
import com.definesys.mpaas.query.model.MpaasBasePojo;
import lombok.Data;

/**
 * 
 * @TableName MDB_ACTOR
 */
@Table(value = "MDB_ACTOR")
@Data
public class MdbActor extends MpaasBasePojo {
    /**
     * 
     */
    @RowID(sequence = "MDB_ACTOR_S")
    @Column(value = "ID")
    private Long id;

    /**
     * 姓名
     */
    @Column(value = "NAME")
    private String name;

    /**
     * 姓名拼音
     */
    @Column(value = "PINYIN")
    private String pinyin;

    /**
     * 出生日期
     */
    @Column(value = "BIRTHDAY")
    private Date birthday;

    /**
     * 出生地
     */
    @Column(value = "TOWN")
    private String town;

    /**
     * 性别
     */
    @Column(value = "SEX")
    private String sex;

    /**
     * 头像id
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

    /**
     * 简介
     */
    @Column(value = "DESCRIPTION")
    private String description;

}