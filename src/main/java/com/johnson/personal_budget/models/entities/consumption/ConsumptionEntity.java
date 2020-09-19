package com.johnson.personal_budget.models.entities.consumption;

import com.johnson.personal_budget.models.entities.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 消费对象
 */
@Data
@Entity
public class ConsumptionEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long consumptionId;
    @Column(length = 255)
    private String content;             // 消费内容
    @Column(columnDefinition = "decimal(19,2) DEFAULT 0.00")
    private BigDecimal amount;          // 消费金额
    @Column(length = 255)
    private String remark;              // 说明
    @Column(length = 20)
    private String source;              // 消费记录来源(保留, 日后使用)
    @Column(length = 20)
    private String channel;             // 支付渠道
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ")
    private Date billDate;              // 账单日期

    @ManyToOne()
    @JoinColumn(name = "consumptionTypeId", nullable = false)
    private ConsumptionTypeEntity consumptionType;  // 消费类型

}
