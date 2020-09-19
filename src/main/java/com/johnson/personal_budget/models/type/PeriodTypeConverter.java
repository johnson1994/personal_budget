package com.johnson.personal_budget.models.type;

import javax.persistence.AttributeConverter;

/**
 * 周期类型,code 转换器
 */
public class PeriodTypeConverter implements AttributeConverter<PeriodType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(PeriodType periodType) {
        if (periodType == null)
            return PeriodType.WEEK.getCode();
        return periodType.getCode();
    }

    @Override
    public PeriodType convertToEntityAttribute(Integer integer) {
        if (integer == null)
            return PeriodType.WEEK;
        return PeriodType.parseFrom(integer);
    }
}
