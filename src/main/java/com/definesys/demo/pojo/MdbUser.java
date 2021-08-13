package com.definesys.demo.pojo;


import java.util.Date;

import com.definesys.mpaas.query.annotation.Column;
import com.definesys.mpaas.query.annotation.RowID;
import com.definesys.mpaas.query.annotation.Table;
import com.definesys.mpaas.query.model.MpaasBasePojo;
import lombok.Data;

/**
 * 
 * @TableName MDB_USER
 */
@Table(value="MDB_USER")
@Data
public class MdbUser extends MpaasBasePojo {
    /**
     * 
     */
    @RowID(sequence = "MDB_USER_S")
    @Column(value = "ID")
    private Long id;

    /**
     * 登录账号
     */
    @Column(value = "ACCOUNT")
    private String account;

    /**
     * 手机号
     */
    @Column(value = "PHONE")
    private String phone;

    /**
     * 昵称
     */
    @Column(value = "NICKNAME")
    private String nickname;

    /**
     * 密码
     */
    @Column(value = "PASSWORD")
    private String password;

    /**
     * ADMIN(管理员)/GUEST(普通用户)
     */
    @Column(value = "ROLE")
    private String role;

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

}