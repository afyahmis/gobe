package org.afyahmis.globe.core.domain;

import org.afyahmis.globe.sharedkernel.model.BaseAggregate;

import java.util.ArrayList;
import java.util.List;

public class Agency extends BaseAggregate {
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
