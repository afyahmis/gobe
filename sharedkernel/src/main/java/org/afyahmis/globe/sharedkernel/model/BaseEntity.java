package org.afyahmis.globe.sharedkernel.model;

public abstract class BaseEntity<TId> {
    protected TId id;

    public TId getId() {
        return id;
    }
}
