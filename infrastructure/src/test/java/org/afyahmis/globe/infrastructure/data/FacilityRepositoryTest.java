package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.core.domain.Facility;
import org.afyahmis.globe.core.domain.IFacilityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
//import org.springframework.test.context;

// @ContextConfiguration({"classpath:/test-applicationContext.xml"})
class FacilityRepositoryTest {

    private static final Logger logger = LogManager.getLogger(FacilityRepositoryTest.class);

    private List<Facility> data;
    private IFacilityRepository facilityRepository;

    @BeforeEach
    void setUp() {
        facilityRepository =new FacilityRepository();
        this.data=facilityRepository.GetAll();
    }

    @Test
    void should_get() {
        Facility Facility= facilityRepository.Get(this.data.get(0).getId());
        assertNotNull(Facility);
        logger.debug(Facility.toString());
    }

    @Test
    void should_getAll() {
        List<Facility> facilities= facilityRepository.GetAll();
        assertTrue(facilities.size()>0);
    }

    @Test
    void should_get_by_code() {
        Facility facility= facilityRepository.GetByCode(10000);
        assertNotNull(facility);
        logger.debug(facility.toString());
    }

    @Test
    void should_create() {
        Facility newFacility= new Facility(12100,"Facilit B", UUID.randomUUID());

        Facility toFind= facilityRepository.Get(newFacility.getId());
        assertNotNull(newFacility);
        logger.debug(newFacility.toString());
    }
}