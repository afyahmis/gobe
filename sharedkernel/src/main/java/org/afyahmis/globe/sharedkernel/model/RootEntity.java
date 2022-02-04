package org.afyahmis.globe.sharedkernel.model;

public abstract class RootEntity<TId> {
    protected TId id;

    public TId getId() {
        return id;
    }
}
