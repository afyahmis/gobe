package org.afyahmis.globe.core.domain;

import org.afyahmis.globe.sharedkernel.interfaces.IBaseAggregateRepository;

public interface IFacilityRepository extends IBaseAggregateRepository<Facility> {
    Facility GetByCode(int code);
}
