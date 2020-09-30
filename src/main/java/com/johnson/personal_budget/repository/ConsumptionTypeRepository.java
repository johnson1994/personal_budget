package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.consumption.ConsumptionTypeEntity;


public interface ConsumptionTypeRepository extends BaseRepository<ConsumptionTypeEntity, Long> {

    ConsumptionTypeEntity findByConsumptionTypeId(Long consumptionId);

}
