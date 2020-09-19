package com.johnson.personal_budget.service.impl;

import com.johnson.personal_budget.models.entities.ConsumptionTypeEntity;
import com.johnson.personal_budget.repository.ConsumptionTypeRepository;
import com.johnson.personal_budget.service.ConsumptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ConsumptionTypeServiceImpl implements ConsumptionTypeService {

    @Autowired
    private ConsumptionTypeRepository consumptionTypeRepository;

    @Override
    public ConsumptionTypeEntity save(ConsumptionTypeEntity entity) {
        return consumptionTypeRepository.save(entity);
    }

    @Override
    public Page<ConsumptionTypeEntity> findAll(Pageable pageable) {
        return consumptionTypeRepository.findAll(pageable);
    }
}
