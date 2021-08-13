package com.definesys.demo.pojo;


import java.util.Date;

import com.definesys.mpaas.query.annotation.Column;
import com.definesys.mpaas.query.annotation.RowID;
import com.definesys.mpaas.query.annotation.Table;
import com.definesys.mpaas.query.model.MpaasBasePojo;
import lombok.Data;

/**
 * 
 * @TableName MDB_ATTACHMENT
 */
@Table(value="MDB_ATTACHMENT")
@Data
public class MdbAttachment extends MpaasBasePojo {
    /**
     * 主键
     */
    @RowID(sequence = "MDB_ATTACHMENT_S")
    @Column(value = "ID")
    private Long id;

    /**
     * 附件uuid
     */
    @Column(value = "UUID")
    private String uuid;

    /**
     * 附件名称
     */
    @Column(value = "ATTACHMENT_NAME")
    private String attachmentName;

    /**
     * 标签（做扩展用）
     */
    @Column(value = "TAG")
    private String tag;

    /**
     * 关联的业务单据号
     */
    @Column(value = "DOC_ID")
    private String docId;

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