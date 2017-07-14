package br.com.santander.resiliente.app;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by brunonasc on 13/07/17.
 */
@Service
public class ServiceBreakingBad {

    @Autowired
    public RestTemplate lbRestTemplate;

    @HystrixCommand(fallbackMethod = "fallbackSayMyName")
    public String ReadBreakingBad() {
        //String myName = new RestTemplate().getForObject("http://localhost:9000/saymyname", String.class);
        String myName = this.lbRestTemplate.getForObject("http://BreakingBadService/saymyname", String.class);
        return myName;
    }

    public String fallbackSayMyName(){
        String myName = "Mr. White";

        return myName;
    }
}
