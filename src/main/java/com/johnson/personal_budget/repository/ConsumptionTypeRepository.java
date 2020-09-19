package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.ConsumptionTypeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ConsumptionTypeRepository extends CrudRepository<ConsumptionTypeEntity, Long> {

    Page<ConsumptionTypeEntity> findAll(Pageable pageable);

    ConsumptionTypeEntity findByConsumptionTypeId(Long consumptionId);
}
