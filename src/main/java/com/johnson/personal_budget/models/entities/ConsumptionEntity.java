package com.johnson.personal_budget.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class ConsumptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long consumptionId;
    private String content;             // 消费内容
    private BigDecimal amount;          // 消费金额
    private String remark;              // 说明
    private String source;              // 消费记录来源(保留, 日后使用)
    private String channel;             // 支付渠道
    private Date date;                  // 消费日期
    private Long personId;              // 用户ID
    private Long consumeTypeId;         // 消费类型ID

}
