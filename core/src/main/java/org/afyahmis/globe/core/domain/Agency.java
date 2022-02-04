package org.afyahmis.globe.core.domain;

import org.afyahmis.globe.sharedkernel.model.AggregateRoot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Agency extends AggregateRoot {
    private String name;
    private String display;
    private List<Facility> facilities;

    public Agency(String name, String display) {
        this.name = name;
        this.display = display;
        facilities=new ArrayList<>();
    }


    public String getName() {
        return name;
    }
    public String getDisplay() {
        return display;
    }
    public List<Facility> getFacilities() {
        return facilities;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "name='" + name + '\'' +
                ", display='" + display + '\'' +
                ", id=" + id +
                '}';
    }
}
