package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.budget.BudgetEntity;
import com.johnson.personal_budget.models.type.EntityStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface BudgetRepository extends CrudRepository<BudgetEntity, Long> {

    Page<BudgetEntity> findAllByStatus(Pageable pageable, EntityStatus status);

    BudgetEntity findByBudgetId(Long budgetId);

}
