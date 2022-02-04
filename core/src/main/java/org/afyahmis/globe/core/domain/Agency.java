package org.afyahmis.globe.core.domain;

import org.afyahmis.globe.sharedkernel.model.AggregateRoot;

import java.util.Set;

public class Agency extends AggregateRoot {
    private String name;
    private String display;
    private Set<Facility> facilities;

    public Agency(String name, String display) {
        this.name = name;
        this.display = display;
    }


    public String getName() {
        return name;
    }
    public String getDisplay() {
        return display;
    }
    public Set<Facility> getFacilities() {
        return facilities;
    }
}
