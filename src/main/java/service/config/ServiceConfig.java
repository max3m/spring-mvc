package service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.CarServiceImpl;

@Configuration
@ComponentScan("service")
public class ServiceConfig {
    @Bean
    public CarServiceImpl getCarServiceImpl() {
        return new CarServiceImpl();
    }

}
