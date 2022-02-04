package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.core.domain.Facility;
import org.afyahmis.globe.core.domain.IFacilityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class FacilityRepositoryTest {

    private static final Logger logger = LogManager.getLogger(FacilityRepositoryTest.class);

    private List<Facility> data;
    private IFacilityRepository FacilityRepository;

    @BeforeEach
    void setUp() {
        data=new ArrayList<>();
        data.add(new Facility(10000,"Facilit A", UUID.randomUUID()));
        data.add(new Facility(10100,"Facilit B", UUID.randomUUID()));
        FacilityRepository=new FacilityRepository(data);
    }

    @Test
    void should_get() {
        Facility Facility=FacilityRepository.Get(this.data.get(0).getId());
        assertNotNull(Facility);
        logger.debug(Facility.toString());
    }

    @Test
    void should_getAll() {
        List<Facility> facilities=FacilityRepository.GetAll();
        assertTrue(facilities.size()>0);
    }

    @Test
    void should_get_by_code() {
        Facility facility=FacilityRepository.GetByCode(10000);
        assertNotNull(facility);
        logger.debug(facility.toString());
    }

    @Test
    void should_create() {
        Facility newFacility= new Facility(12100,"Facilit B", UUID.randomUUID());

        Facility toFind=FacilityRepository.Get(newFacility.getId());
        assertNotNull(newFacility);
        logger.debug(newFacility.toString());
    }
}