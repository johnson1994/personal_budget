package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.bill.SubBillEntity;

public interface SubBillRepository extends BaseRepository<SubBillEntity, Long> {
    SubBillEntity findBySubBillId(Long subBillId);
}
