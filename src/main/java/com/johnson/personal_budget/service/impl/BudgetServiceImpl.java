package com.johnson.personal_budget.service.impl;

import com.johnson.personal_budget.models.entities.budget.BudgetEntity;
import com.johnson.personal_budget.models.type.EntityStatus;
import com.johnson.personal_budget.repository.BudgetRepository;
import com.johnson.personal_budget.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;


    @Override
    public BudgetEntity save(BudgetEntity entity) {
        return budgetRepository.save(entity);
    }

    @Override
    public Page<BudgetEntity> findAll(Pageable pageable) {
        return budgetRepository.findAllByStatus(pageable, EntityStatus.ON);
    }
}
