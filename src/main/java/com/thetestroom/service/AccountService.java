package com.thetestroom.service;

import com.thetestroom.models.Account;
import com.thetestroom.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// This class is used to provide some service i.e. some business logic
// The annotation is stereotype i.e. you can use it with Spring without a real specific meaning
public class AccountService {

    @Autowired
    // Notice that there is no bean configuration specified for this
    private AccountRepository accountRepository;

    public List<Account> list() {
       return accountRepository.findAll();
    }

    public Account get(Long index) {
        return accountRepository.getOne(index);
    }

}
