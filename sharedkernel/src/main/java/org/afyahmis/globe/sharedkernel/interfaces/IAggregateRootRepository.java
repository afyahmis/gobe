package org.afyahmis.globe.sharedkernel.interfaces;

import org.afyahmis.globe.sharedkernel.model.AggregateRoot;

import java.util.List;
import java.util.UUID;

public interface IAggregateRootRepository<T extends AggregateRoot> {
    T Get(UUID id);
    List<T> GetAll();
    void Create(T entity);
}
