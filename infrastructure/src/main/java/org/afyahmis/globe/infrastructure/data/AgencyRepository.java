package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.core.domain.Agency;
import org.afyahmis.globe.core.domain.IAgencyRepository;

import java.util.List;

public class AgencyRepository extends AggregateRootRepository<Agency> implements IAgencyRepository {
    public AgencyRepository() {
    }

    public AgencyRepository(List<Agency> data) {
        super(data);
    }
}
