package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.consumption.ConsumptionTypeEntity;
import com.johnson.personal_budget.models.type.EntityStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConsumptionTypeRepository extends CrudRepository<ConsumptionTypeEntity, Long> {

    ConsumptionTypeEntity findByConsumptionTypeId(Long consumptionId);

    List<ConsumptionTypeEntity> findByStatus(EntityStatus status);

    List<ConsumptionTypeEntity> findByStatusNot(EntityStatus status);


}
