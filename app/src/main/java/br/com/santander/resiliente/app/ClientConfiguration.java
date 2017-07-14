package br.com.santander.resiliente.app;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by brunonasc on 13/07/17.
 */
@Configuration
public class ClientConfiguration {
    @LoadBalanced
    @Bean
    public RestTemplate lbRestTemplate(){
        return new RestTemplate();
    }
}
