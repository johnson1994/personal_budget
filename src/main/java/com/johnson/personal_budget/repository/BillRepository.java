package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.bill.BillEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BillRepository extends CrudRepository<BillEntity, Long> {
    Page<BillEntity> findAll(Pageable pageable);

    BillEntity findAllByBillId(Long billId);

}
