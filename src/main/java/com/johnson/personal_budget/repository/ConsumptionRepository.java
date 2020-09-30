package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.consumption.ConsumptionEntity;
import com.johnson.personal_budget.models.type.EntityStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ConsumptionRepository extends CrudRepository<ConsumptionEntity, Long> {

    Page<ConsumptionEntity> findAllByStatus(Pageable pageable, EntityStatus status);

    ConsumptionEntity findByConsumptionId(Long consumptionId);

}
