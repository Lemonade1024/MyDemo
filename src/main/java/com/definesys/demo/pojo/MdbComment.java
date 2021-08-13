package com.definesys.demo.pojo;


import java.util.Date;

import com.definesys.mpaas.query.annotation.Column;
import com.definesys.mpaas.query.annotation.RowID;
import com.definesys.mpaas.query.annotation.Table;
import com.definesys.mpaas.query.model.MpaasBasePojo;
import lombok.Data;

/**
 * 
 * @TableName MDB_COMMENT
 */
@Table(value="MDB_COMMENT")
@Data
public class MdbComment extends MpaasBasePojo  {
    /**
     * 主键
     */
    @RowID(sequence = "MDB_COMMENT_S")
    @Column(value = "ID")
    private Long id;

    /**
     * 用户id
     */
    @Column(value = "USER_ID")
    private Long userId;

    /**
     * 电影id
     */
    @Column(value = "MOVIE_ID")
    private Long movieId;

    /**
     * 分数
     */
    @Column(value = "STAR")
    private Long star;

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
     * 评论内容
     */
    @Column(value = "CONTENT")
    private String content;

}