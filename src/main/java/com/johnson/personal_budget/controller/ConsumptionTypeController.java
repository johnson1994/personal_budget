package com.johnson.personal_budget.controller;

import com.johnson.personal_budget.models.ResponseModel;
import com.johnson.personal_budget.models.entities.consumption.ConsumptionTypeEntity;
import com.johnson.personal_budget.service.ConsumptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/budget/api/consumptionType")
@RestController()
public class ConsumptionTypeController {

    @Autowired
    private ConsumptionTypeService consumptionTypeService;

    /**
     * 分页查询消费分类
     *
     * @return 消费分类页面
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseModel<List<ConsumptionTypeEntity>> consumptionTypePage() {
        List<ConsumptionTypeEntity> consumptionTypePage = consumptionTypeService.findAll();
        return ResponseModel.success(consumptionTypePage);
    }

    /**
     * 创建消费类型
     *
     * @param consumptionTypeEntity 消费类型对象
     * @return 创建好的消费类型
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseModel<ConsumptionTypeEntity> save(@RequestBody ConsumptionTypeEntity consumptionTypeEntity) {
        consumptionTypeEntity = consumptionTypeService.save(consumptionTypeEntity);
        return ResponseModel.success(consumptionTypeEntity);
    }

}
