package org.afyahmis.globe.core.domain;


import org.afyahmis.globe.sharedkernel.model.AggregateRoot;

import java.util.UUID;

public class Facility extends AggregateRoot {
    private int code;
    private String name;
    private UUID agencyId;

    public Facility(int code, String name, UUID agencyId) {
        this.code = code;
        this.name = name;
        this.agencyId = agencyId;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public UUID getAgencyId() {
        return agencyId;
    }
}
