package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.core.domain.Facility;
import org.afyahmis.globe.core.domain.IFacilityRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FacilityRepository extends BaseAggregateRepository<Facility> implements IFacilityRepository {

    public FacilityRepository() {
        this.data=new ArrayList<>();
        this.data.add(new Facility(10000,"Facilit A", UUID.randomUUID()));
        this.data.add(new Facility(10100,"Facilit B", UUID.randomUUID()));
    }

    @Override
    public Facility GetByCode(int code) {
        return GetAll()
                .stream().filter(x->x.getCode()==code)
                .findFirst()
                .orElse(null);
    }
}

