package com.thetestroom.controller;

import com.thetestroom.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

// Annotation below used to allow cross origin requests
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HelloController {

    static Logger log = Logger.getLogger(HelloController.class.getName());

    @Autowired
    // The controller provides a service
    private AccountService accountService;

    @RequestMapping(value = "/hi/{id}", method = RequestMethod.GET, produces = "application/json")
    // Takes a long ID and returns an entity name
    public String hi(@PathVariable("id") Long index) {
        log.info("Called /hi/" + index);
        log.info("Returning = {\"message\":\"hi " + accountService.get(index).getName() + "\"}");
        return "{\"message\":\"hi " + accountService.get(index).getName() + "\"}";
    }

}
