package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.core.domain.Agency;
import org.afyahmis.globe.core.domain.IAgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AgencyRepository extends BaseAggregateRepository<Agency> implements IAgencyRepository {
    public AgencyRepository() {
        this.data = new ArrayList<>();
        this.data.add(new Agency("CDC", "CDC"));
        this.data.add(new Agency("USAID", "USAID"));
    }
}
