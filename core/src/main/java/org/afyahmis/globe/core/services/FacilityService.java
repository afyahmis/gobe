package org.afyahmis.globe.core.services;

import org.afyahmis.globe.core.domain.Facility;
import org.afyahmis.globe.core.domain.IFacilityRepository;
import org.afyahmis.globe.core.domain.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {

    private IFacilityRepository facilityRepository;

    public FacilityService(IFacilityRepository facilityRepository) {
        this.facilityRepository = facilityRepository;
    }


    @Override
    public List<Facility> Load() {
        return this.facilityRepository.GetAll();
    }
}
