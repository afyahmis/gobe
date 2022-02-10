package org.afyahmis.globe.sharedkernel.model;

import java.util.UUID;

public  abstract class BaseAggregate extends BaseEntity<UUID> {
    public BaseAggregate(){
        this.id=UUID.randomUUID();
    }
}
