package org.afyahmis.globe.app;



import org.afyahmis.globe.config.DevConfig;
import org.afyahmis.globe.config.ProdConfig;
import org.afyahmis.globe.core.domain.Agency;
import org.afyahmis.globe.core.domain.Facility;
import org.afyahmis.globe.core.domain.IAgencyService;
import org.afyahmis.globe.core.domain.IFacilityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Startup {

    public static ApplicationContext ctx;

    public static void main(String[] args)
    {
        InitApp();

        IAgencyService agencyService=ctx.getBean("otherAgencyService",IAgencyService.class);
        IFacilityService facilityService=ctx.getBean(IFacilityService.class);

        List<Agency>agencies= agencyService.Load();
        List<Facility> facilities=facilityService.Load();

        System.out.println("Agency List");
        for (Agency agency: agencies) {
            System.out.println(" >"+agency.getName());
        }

        System.out.println("Facility List");
        for (Facility facility:facilities) {
            System.out.println(" >"+facility.getName());
        }

    }
    private static void InitApp() {
        System.setProperty("spring.profiles.active","prod");
        ctx = new AnnotationConfigApplicationContext(DevConfig.class, ProdConfig.class);
    }
}

