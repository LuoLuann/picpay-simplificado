package com.picpaysimplificado.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    //Preciso dizer ao spring onde ele encontrará o RestTemplate usado nos services
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
