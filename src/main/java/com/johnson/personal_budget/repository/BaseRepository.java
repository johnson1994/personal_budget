package com.johnson.personal_budget.repository;

import com.johnson.personal_budget.models.entities.BaseEntity;
import com.johnson.personal_budget.models.type.EntityStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 基础查询封装
 *
 * @param <T>  模型
 * @param <ID> 主键类型
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, ID> extends CrudRepository<T, ID> {

    Page<T> findAllByStatus(Pageable pageable, EntityStatus status);

    Iterable<T> findAllByStatus(EntityStatus status);

}
