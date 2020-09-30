package com.johnson.personal_budget.models.entities.budget;

import com.johnson.personal_budget.models.entities.BaseEntity;
import com.johnson.personal_budget.models.entities.income.IncomeEntity;
import com.johnson.personal_budget.models.type.PeriodType;
import com.johnson.personal_budget.models.type.PeriodTypeConverter;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * 预算对象
 */
@Data
@Entity
public class BudgetEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long budgetId;
    @Column(length = 128)
    private String budgetName;                  // 预算名称
    @Column(length = 255)
    private String remark;                      // 备注
    @Convert(converter = PeriodTypeConverter.class)
    @Column(columnDefinition = "TINYINT(1) DEFAULT 7 ")
    private PeriodType periodType;              // 周期类型（周/月/季/年）
    @Column(columnDefinition = "TINYINT(1) DEFAULT 1 ")
    private Boolean autoNext;                   // 自动创建下一期预算
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ")
    private Date startDate;                     // 账单开始日期
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ")
    private Date endDate;                       // 账单结束日期
    @Column(columnDefinition = "decimal(19,2) DEFAULT 0.00")
    private BigDecimal totalAmount;             // 总预算金额
    @OneToMany(targetEntity = SubBudgetEntity.class)
    private Set<SubBudgetEntity> subBudgetSet;  // 子预算集合

    @Column(columnDefinition = "decimal(19,2) DEFAULT 0.00")
    private BigDecimal totalIncome;             // 预算周期内的总收入
    @Column(columnDefinition = "decimal(19,2) DEFAULT 0.00")
    private BigDecimal balance;                 // 结余
    @ManyToMany
    @JoinTable(name = "budget_income_relation", joinColumns = {
            @JoinColumn(name = "budget_id", referencedColumnName = "budgetId")
    }, inverseJoinColumns = {
            @JoinColumn(name = "income_id", referencedColumnName = "incomeId")
    })
    private Set<IncomeEntity> incomeSet;        // 收入集合

}
