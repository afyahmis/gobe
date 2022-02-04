package org.afyahmis.globe.sharedkernel.model;

import java.util.UUID;

public  abstract class AggregateRoot extends RootEntity<UUID> {
    public AggregateRoot(){
        this.id=UUID.randomUUID();
    }
}
