package com.johnson.personal_budget.service;

import com.johnson.personal_budget.models.entities.budget.BudgetEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BudgetService {

    BudgetEntity save(BudgetEntity entity);

    Page<BudgetEntity> findAll(Pageable pageable);

}
