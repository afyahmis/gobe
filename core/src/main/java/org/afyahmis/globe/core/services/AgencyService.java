package org.afyahmis.globe.core.services;

import org.afyahmis.globe.core.domain.Agency;
import org.afyahmis.globe.core.domain.IAgencyRepository;
import org.afyahmis.globe.core.domain.IAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyService implements IAgencyService {

    @Value("${app.name}")
    private String app;
    @Value("${app.ver}")
    private String appVer;

    private IAgencyRepository agencyRepository;


    public AgencyService(IAgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    @Override
    public List<Agency> Load() {
        System.out.println(app+appVer);
        return this.agencyRepository.GetAll();
    }
}
