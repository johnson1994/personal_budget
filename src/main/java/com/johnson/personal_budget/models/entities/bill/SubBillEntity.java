package com.johnson.personal_budget.models.entities.bill;

import com.johnson.personal_budget.models.entities.BaseEntity;
import com.johnson.personal_budget.models.entities.consumption.ConsumptionEntity;
import com.johnson.personal_budget.models.entities.consumption.ConsumptionTypeEntity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

/**
 * 子账单对象
 */
@Data
@Entity
public class SubBillEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subBillId;
    @ManyToOne()
    @JoinColumn(name = "billId", nullable = false)
    private BillEntity bill;
    @ManyToOne()
    @JoinColumn(name = "consumptionTypeId", nullable = false)
    private ConsumptionTypeEntity consumptionType;      // 消费类型
    @Column(columnDefinition = "decimal(19,2) DEFAULT 0.00")
    private BigDecimal totalAmount;                     // 账单总金额
    @ManyToMany
    @JoinTable(name = "sub_bill_consumption_relation", joinColumns = {
            @JoinColumn(name = "sub_bill_id", referencedColumnName = "subBillId")
    }, inverseJoinColumns = {
            @JoinColumn(name = "consumption_id", referencedColumnName = "consumptionId")
    })
    private Set<ConsumptionEntity> consumptionSet;      // 本子账单的消费列表


}
