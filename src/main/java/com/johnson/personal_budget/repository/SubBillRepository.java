package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.bill.BillEntity;
import com.johnson.personal_budget.models.entities.bill.SubBillEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubBillRepository extends CrudRepository<SubBillEntity, Long> {
    SubBillEntity findBySubBillId(Long subBillId);
}
