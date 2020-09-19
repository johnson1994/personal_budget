package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.ConsumptionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ConsumptionRepository extends CrudRepository<ConsumptionEntity, Long> {

    Page<ConsumptionEntity> findAll(Pageable pageable);

    ConsumptionEntity findByConsumptionId(Long consumptionId);

}
