package com.definesys.demo.pojo;

import java.util.Date;

import com.definesys.mpaas.query.annotation.Column;
import com.definesys.mpaas.query.annotation.RowID;
import com.definesys.mpaas.query.annotation.Table;
import com.definesys.mpaas.query.model.MpaasBasePojo;
import lombok.Data;

/**
 * 
 * @TableName MDB_MOVIE_TAG
 */
@Table(value="MDB_MOVIE_TAG")
@Data
public class MdbMovieTag extends MpaasBasePojo {
    /**
     * 主键
     */
    @RowID(sequence = "MDB_MOVIE_TAG_S")
    @Column(value = "ID")
    private Long id;

    /**
     * 标签名称
     */
    @Column(value = "TAG_NAME")
    private String tagName;

    /**
     * 标签状态（ENABLE/DISABLE)
     */
    @Column(value = "STATUS")
    private String status;

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