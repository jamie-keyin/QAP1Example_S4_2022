package com.keyin.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AccountManagerTest {
    @Mock
    private AccountDB mockAccountDB;

    @Test
    public void testGetActiveAccountsForCustomer() {
        AccountManager accountManagerUnderTest = new AccountManager();
        accountManagerUnderTest.setAccountDB(mockAccountDB);

        List<Account> accountsForTest = new ArrayList<Account>();

        Account accountForJamie = new Account();
        accountForJamie.setName("Jamie");

        accountsForTest.add(accountForJamie);


        Mockito.when(mockAccountDB.getAllAccounts()).thenReturn(accountsForTest);

        List<Account> accountsFound = accountManagerUnderTest.getActiveAccountsForCustomer("Jamie");

        Assertions.assertTrue(accountsFound.size() == 1);



        accountForJamie.setActive(false);

        accountsFound = accountManagerUnderTest.getActiveAccountsForCustomer("Jamie");

        Assertions.assertTrue(accountsFound.size() == 0);


        System.out.println("Testing.....  finished!");
    }
}
