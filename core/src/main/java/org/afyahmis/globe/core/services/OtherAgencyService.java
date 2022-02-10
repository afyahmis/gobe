package org.afyahmis.globe.core.services;

import org.afyahmis.globe.core.domain.Agency;
import org.afyahmis.globe.core.domain.IAgencyRepository;
import org.afyahmis.globe.core.domain.IAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OtherAgencyService implements IAgencyService {
    @Value("${app.name}")
    private String app;
    @Value("${app.ver}")
    private String appVer;

    private Environment environment;
    private IAgencyRepository agencyRepository;


    public OtherAgencyService(IAgencyRepository agencyRepository,Environment environment) {
        this.agencyRepository = agencyRepository;
        this.environment=environment;
    }

    @Override
    public List<Agency> Load() {
        System.out.println(app + appVer);
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        List<Agency> agencies = this.agencyRepository.GetAll();
        return agencies.stream()
                .map(a -> {
                    a.ChangeName(" XXX");
                    return a;
                }).toList();
    }
}
