package com.johnson.personal_budget.models.entities;

import com.johnson.personal_budget.models.type.EntityStatus;
import com.johnson.personal_budget.models.type.EntityStatusConverter;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * 基础对象
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    private Long creatorId;         // 创建人ID
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ")
    private Date createDate;        // 创建时间
    private Long updaterId;         // 修改人ID
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ")
    private Date updateDate;        // 修改时间
    @Convert(converter = EntityStatusConverter.class)
    @Column(columnDefinition ="TINYINT(1) DEFAULT 1 ")
    private EntityStatus status;    // 状态 (启用/停用/删除)

}
