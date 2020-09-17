package com.johnson.personal_budget.models.type;

import javax.persistence.AttributeConverter;

/**
 * 实体状态和int转换器
 */
public class EntityStatusConverter implements AttributeConverter<EntityStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(EntityStatus entityStatus) {
        if (entityStatus == null)
            return EntityStatus.ON.getCode();
        return entityStatus.getCode();
    }

    @Override
    public EntityStatus convertToEntityAttribute(Integer integer) {
        if (integer == null)
            return EntityStatus.DELETED;
        return EntityStatus.parseFrom(integer);
    }
}
