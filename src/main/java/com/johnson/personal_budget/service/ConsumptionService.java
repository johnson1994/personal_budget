package com.johnson.personal_budget.service;

import com.johnson.personal_budget.models.entities.ConsumptionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ConsumptionService {

    ConsumptionEntity save(ConsumptionEntity entity);

    Page<ConsumptionEntity> findAll(Pageable pageable);

}
