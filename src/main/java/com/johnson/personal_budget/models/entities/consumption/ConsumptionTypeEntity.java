package com.johnson.personal_budget.models.entities.consumption;


import com.johnson.personal_budget.models.entities.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ConsumptionTypeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long consumptionTypeId;
    @Column(length = 25)
    private String typeName;
    @Column(length = 255)
    private String remark;

}
