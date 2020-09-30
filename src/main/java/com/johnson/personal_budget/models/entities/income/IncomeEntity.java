package com.johnson.personal_budget.models.entities.income;

import com.johnson.personal_budget.models.entities.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 收入对象
 */
@Data
@Entity
public class IncomeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long incomeId;
    @Column(columnDefinition = "decimal(19,2) DEFAULT 0.00")
    private BigDecimal amount;          // 收入金额
    @Column(length = 255)
    private String remark;              // 收入说明
}
