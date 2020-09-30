package com.johnson.personal_budget.models.entities.budget;

import com.johnson.personal_budget.models.entities.BaseEntity;
import com.johnson.personal_budget.models.entities.consumption.ConsumptionTypeEntity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 预算子项
 */
@Data
@Entity
public class SubBudgetEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subBudgetId;
    @ManyToOne()
    @JoinColumn(name = "budgetId", nullable = false)
    private BudgetEntity budget;
    @ManyToOne()
    @JoinColumn(name = "consumptionTypeId", nullable = false)
    private ConsumptionTypeEntity consumptionType;      // 消费类型
    @Column(columnDefinition = "decimal(19,2) DEFAULT 0.00")
    private BigDecimal amount;                          // 本项预算金额
    @Column(length = 512)
    private String remark;                              // 预算说明

}
