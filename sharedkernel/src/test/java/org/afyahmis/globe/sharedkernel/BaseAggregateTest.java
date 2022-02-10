package org.afyahmis.globe.sharedkernel;

import org.afyahmis.globe.sharedkernel.model.BaseAggregate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class BaseAggregateTest {

    private static final Logger logger = LogManager.getLogger(BaseAggregateTest.class);
    @Test
    public void should_haveId(){
        TestCar car=new TestCar();
        car.setName("Subaru");

        assertNotNull(car.getId());
        logger.info(car.getId()+" "+car.getName());
    }

    class TestCar extends BaseAggregate {


        private String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

