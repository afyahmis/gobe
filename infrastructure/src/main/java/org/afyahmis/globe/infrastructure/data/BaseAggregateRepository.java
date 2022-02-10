package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.sharedkernel.interfaces.IBaseAggregateRepository;
import org.afyahmis.globe.sharedkernel.model.BaseAggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BaseAggregateRepository<T extends BaseAggregate> implements IBaseAggregateRepository<T> {

    protected List<T> data = new ArrayList<>();

    protected BaseAggregateRepository() {
    }

    @Override
    public T Get(UUID id) {
        return data.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<T> GetAll() {
        return data;
    }

    @Override
    public void Create(T entity) {
        data.add(entity);
    }
}
