package com.thetestroom.controller;

import com.thetestroom.models.Account;
import com.thetestroom.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    // The controller provides a service
    private AccountService accountService;

    // This is an api endpoint
    @RequestMapping("/hi/{id}")
    // Takes a long ID and returns an entity name
    public String hi(@PathVariable("id") Long index) {
        return "Hi " + accountService.get(index).getName();
    }

    @RequestMapping("/all")
    // Will get all names and return as a List of Strings
    public List<String> hey() {
        List<String> everyOne = new ArrayList<>();
        for (Account account : accountService.list()) {
            everyOne.add(account.getName());
        }
        return everyOne;
    }
}
