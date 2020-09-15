package com.johnson.personal_budget.service.impl;

import com.johnson.personal_budget.models.entities.ConsumptionEntity;
import com.johnson.personal_budget.repository.ConsumptionRepository;
import com.johnson.personal_budget.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ConsumptionServiceImpl implements ConsumptionService {

    @Autowired
    private ConsumptionRepository consumptionRepository;

    @Override
    public ConsumptionEntity save(ConsumptionEntity entity) {
        return consumptionRepository.save(entity);
    }

    @Override
    public Page<ConsumptionEntity> findAll(Pageable pageable) {
        return consumptionRepository.findAll(pageable);
    }
}
