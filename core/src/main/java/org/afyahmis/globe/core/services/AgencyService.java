package org.afyahmis.globe.core.services;

import org.afyahmis.globe.core.domain.Agency;
import org.afyahmis.globe.core.domain.IAgencyRepository;
import org.afyahmis.globe.core.domain.IAgencyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyService implements IAgencyService {

    private IAgencyRepository agencyRepository;


    public AgencyService(IAgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    @Override
    public List<Agency> Load() {
       return this.agencyRepository.GetAll();
    }
}
