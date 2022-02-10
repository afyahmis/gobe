package org.afyahmis.globe.core.services;

import org.afyahmis.globe.core.domain.Agency;
import org.afyahmis.globe.core.domain.IAgencyService;
import org.afyahmis.globe.infrastructure.data.AgencyRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgencyServiceTest {
    private static final Logger logger = LogManager.getLogger(AgencyServiceTest.class);

    private IAgencyService service;

    @BeforeEach
    void setUp() {
        service=new AgencyService(new AgencyRepository());
    }

    @Test
    void shoul_load() {
        List<Agency> agencies= service.Load();
        assertTrue(agencies.size()>0);
    }
}