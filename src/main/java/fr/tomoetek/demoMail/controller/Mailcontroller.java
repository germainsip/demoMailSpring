package fr.tomoetek.demoMail.controller;

import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import fr.tomoetek.demoMail.utils.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Mailcontroller {
    @Autowired
    private EmailService mEmailService;

    @GetMapping("/retour/{name}")
    public String retour(@PathVariable String name) {
        mEmailService.sendEmail(name+"@truc.com", "test", "test test");
        
        return name;
    }
    
    
}
