package br.com.santander.resiliente.app;

import com.netflix.hystrix.Hystrix;
import com.netflix.hystrix.HystrixCircuitBreaker;
import com.netflix.hystrix.HystrixExecutable;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * Created by brunonasc on 12/07/17.
 */
@Controller
public class HomeController {
    @Autowired
    private ServiceBreakingBad service;

    @GetMapping("/home")
    public String getHomepage(Model model){
        String myName = service.ReadBreakingBad();
        model.addAttribute("person", new Person(myName));
        return "home";
    }


}