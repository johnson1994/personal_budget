package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.budget.BudgetEntity;
import org.springframework.data.repository.CrudRepository;

public interface BudgetRepository extends BaseRepository<BudgetEntity, Long> {

    BudgetEntity findByBudgetId(Long budgetId);

}
