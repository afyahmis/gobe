package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.sharedkernel.interfaces.IAggregateRootRepository;
import org.afyahmis.globe.sharedkernel.model.AggregateRoot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public abstract class AggregateRootRepository<T extends AggregateRoot> implements IAggregateRootRepository<T> {

    private List<T> data = new ArrayList<>();

    protected AggregateRootRepository() {
    }

    protected AggregateRootRepository(List<T> data) {
        this.data = data;
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
