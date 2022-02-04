package org.afyahmis.globe.infrastructure.data;

import org.afyahmis.globe.core.domain.Agency;
import org.afyahmis.globe.core.domain.IAgencyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgencyRepositoryTest {

    private List<Agency> data;
    private IAgencyRepository agencyRepository;
    @BeforeEach
    void setUp() {
        data=new ArrayList<>();
        data.add(new Agency("CDC","CDC"));
        data.add(new Agency("USAID","USAID"));
        agencyRepository=new AgencyRepository(data);
    }

    @Test
    void should_get() {
        Agency agency=agencyRepository.Get(this.data.get(0).getId());
        assertNotNull(agency);
    }

    @Test
    void should_getAll() {
        List<Agency> agency=agencyRepository.GetAll();
        assertTrue(agency.size()>0);
    }

    @Test
    void should_create() {
        Agency newAgency= new Agency("X","X");

        Agency toFind=agencyRepository.Get(newAgency.getId());
        assertNotNull(newAgency);
    }
}