package com.johnson.personal_budget.service;

import com.johnson.personal_budget.models.entities.consumption.ConsumptionTypeEntity;

import java.util.List;

public interface ConsumptionTypeService {

    ConsumptionTypeEntity save(ConsumptionTypeEntity entity);

    List<ConsumptionTypeEntity> findAll();

}
