package br.com.santander.resiliente.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by brunonasc on 12/07/17.
 */
@RestController
public class BreakingBadController {
    @RequestMapping("/saymyname")
    public String sayMyName(){
        return "My name is heiseinberg!";
    }
}
