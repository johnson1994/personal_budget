package com.johnson.personal_budget.models.entities.bill;

import com.johnson.personal_budget.models.entities.BaseEntity;
import com.johnson.personal_budget.models.type.PeriodType;
import com.johnson.personal_budget.models.type.PeriodTypeConverter;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * 账单对象
 */
@Data
@Entity
public class BillEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billId;                        // 账单ID
    @Column(length = 50)
    private String billName;                    // 账单名称（系统创建）
    @Column(length = 255)
    private String remark;                      // 备注（用户自己添加）
    @Convert(converter = PeriodTypeConverter.class)
    @Column(columnDefinition = "TINYINT(1) DEFAULT 7 ")
    private PeriodType periodType;              // 周期类型（周/月/季/年）
    @Column(columnDefinition = "decimal(19,2) DEFAULT 0.00")
    private BigDecimal totalAmount;             // 账单总金额
    @OneToMany(targetEntity = SubBillEntity.class)
    private Set<SubBillEntity> subBillSet;    // 子账单列表
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ")
    private Date startDate;                     // 账单开始日期
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ")
    private Date endDate;                       // 账单结束日期

}
