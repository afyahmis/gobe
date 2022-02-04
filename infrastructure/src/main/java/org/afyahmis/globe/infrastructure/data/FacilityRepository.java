package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.core.domain.Facility;
import org.afyahmis.globe.core.domain.IFacilityRepository;

import java.util.List;

public class FacilityRepository extends AggregateRootRepository<Facility> implements IFacilityRepository {

    public FacilityRepository() {
    }

    public FacilityRepository(List<Facility> data) {
        super(data);
    }

    @Override
    public Facility GetByCode(int code) {
        return GetAll()
                .stream().filter(x->x.getCode()==code)
                .findFirst()
                .orElse(null);

    }
}

