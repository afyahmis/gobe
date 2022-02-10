package org.afyahmis.globe.core.services;

import org.afyahmis.globe.core.domain.*;
import org.afyahmis.globe.infrastructure.data.AgencyRepository;
import org.afyahmis.globe.infrastructure.data.FacilityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FacilityServiceTest {

    private static final Logger logger = LogManager.getLogger(FacilityServiceTest.class);

    private IFacilityService service;

    @BeforeEach
    void setUp() {
        service=new FacilityService(new FacilityRepository());
    }

    @Test
    void shoul_load() {
        List<Facility> facilities= service.Load();
        assertTrue(facilities.size()>0);
    }
}