package org.afyahmis.globe.sharedkernel.interfaces;

import org.afyahmis.globe.sharedkernel.model.BaseAggregate;

import java.util.List;
import java.util.UUID;

public interface IBaseAggregateRepository<T extends BaseAggregate> {
    T Get(UUID id);
    List<T> GetAll();
    void Create(T entity);
}
