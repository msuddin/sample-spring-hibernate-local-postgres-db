package com.thetestroom.service;

import com.thetestroom.models.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void shouldCreateDbByHibernateAndPopulateTable() {
        // Given
        List<Account> account = accountService.list();

        // Then
        Assert.assertThat(account.size(), is(3));
    }
}
