package org.afyahmis.globe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("prod")
@Configuration
@ComponentScan(basePackages = "org.afyahmis.globe")
@PropertySource("classpath:application-prod.properties")
public class ProdConfig {
}
