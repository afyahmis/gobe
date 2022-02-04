package org.afyahmis.globe.core.domain;

import org.afyahmis.globe.sharedkernel.interfaces.IAggregateRootRepository;

public interface IFacilityRepository extends IAggregateRootRepository<Facility> {
    Facility GetByCode(int code);
}
