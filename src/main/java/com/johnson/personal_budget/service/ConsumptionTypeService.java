package com.johnson.personal_budget.service;

import com.johnson.personal_budget.models.entities.consumption.ConsumptionTypeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ConsumptionTypeService {

    ConsumptionTypeEntity save(ConsumptionTypeEntity entity);

    Page<ConsumptionTypeEntity> findAll(Pageable pageable);

}
