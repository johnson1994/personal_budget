package com.johnson.personal_budget.service.impl;

import com.johnson.personal_budget.models.entities.consumption.ConsumptionTypeEntity;
import com.johnson.personal_budget.models.type.EntityStatus;
import com.johnson.personal_budget.repository.ConsumptionTypeRepository;
import com.johnson.personal_budget.service.ConsumptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumptionTypeServiceImpl implements ConsumptionTypeService {

    @Autowired
    private ConsumptionTypeRepository consumptionTypeRepository;

    @Override
    public ConsumptionTypeEntity save(ConsumptionTypeEntity entity) {
        return consumptionTypeRepository.save(entity);
    }

    @Override
    public List<ConsumptionTypeEntity> findAll() {
        return (List<ConsumptionTypeEntity>) consumptionTypeRepository.findAllByStatus(EntityStatus.ON);
    }
}
