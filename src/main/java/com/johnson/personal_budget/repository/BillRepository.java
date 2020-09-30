package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.bill.BillEntity;


public interface BillRepository extends BaseRepository<BillEntity, Long> {

    BillEntity findByBillId(Long billId);

}
