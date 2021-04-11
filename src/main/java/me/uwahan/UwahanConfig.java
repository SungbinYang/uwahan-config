package me.uwahan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UwahanConfig {

    @Bean
    public UwahanController uwahanController() {
        return new UwahanController();
    }
}
