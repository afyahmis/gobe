package org.afyahmis.globe.app;

import org.afyahmis.globe.core.domain.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class Startup {
    public static ApplicationContext ctx;
    public static void main(String[] args)
    {
        InitApp();

        IAgencyService agencyService=ctx.getBean(IAgencyService.class);
        IFacilityService facilityService=ctx.getBean(IFacilityService.class);

        List<Agency>agencies= agencyService.Load();
        List<Facility> facilities=facilityService.Load();

        System.out.println("Agency List");
        for (Agency agency: agencies) {
            System.out.println(" >"+agency.getDisplay());
        }

        System.out.println("Facility List");
        for (Facility facility:facilities) {
            System.out.println(" >"+facility.getName());
        }

    }
    private static void InitApp() {
        ctx = new ClassPathXmlApplicationContext("app.xml");
    }
}
