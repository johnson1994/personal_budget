package com.johnson.personal_budget.controller;

import com.johnson.personal_budget.models.ResponseModel;
import com.johnson.personal_budget.models.entities.ConsumptionEntity;
import com.johnson.personal_budget.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/hello")
@RestController()
public class ConsumptionController {

    @Autowired
    private ConsumptionService consumptionService;

    /**
     * 分页查询消费记录
     *
     * @param pageable 分页对象
     * @return 消费记录页
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseModel<Page<ConsumptionEntity>> consumptionPage(@PageableDefault(page = 0, size = 10) Pageable pageable) {
        Page<ConsumptionEntity> consumptionPage = consumptionService.findAll(pageable);
        return ResponseModel.success(consumptionPage);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseModel<ConsumptionEntity> saveConsumption(@RequestBody ConsumptionEntity consumptionEntity) {
        consumptionEntity = consumptionService.save(consumptionEntity);
        return ResponseModel.success(consumptionEntity);
    }

}
