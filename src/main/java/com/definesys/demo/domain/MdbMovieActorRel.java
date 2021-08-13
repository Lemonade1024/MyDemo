package com.definesys.demo.domain;

import java.io.Serializable;
import java.util.Date;

import com.definesys.mpaas.query.annotation.Column;
import com.definesys.mpaas.query.annotation.Table;
import com.definesys.mpaas.query.model.MpaasBasePojo;
import lombok.Data;

/**
 * 
 * @TableName MDB_MOVIE_ACTOR_REL
 */
@Table(value="MDB_MOVIE_ACTOR_REL")
@Data
public class MdbMovieActorRel extends MpaasBasePojo {
    /**
     * 主键
     */

    @Column(value = "ID")
    private Long id;

    /**
     * 演员ID
     */
    @Column(value = "ACTOR_ID")
    private Long actorId;

    /**
     * 电影ID
     */
    @Column(value = "MOVIE_ID")
    private Long movieId;

    /**
     * 角色类型 ACTOR(演员)/DIRECTOR(导演)/SCREENWRITER(编剧)
     */
    @Column(value = "ROLE")
    private String role;

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