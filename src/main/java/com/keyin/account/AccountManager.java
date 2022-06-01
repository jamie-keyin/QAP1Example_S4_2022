package com.keyin.account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private AccountDB accountDB;

    public List<Account> getActiveAccountsForCustomer(String name) {
       List<Account> accountsFound = new ArrayList<Account>();

       if (accountDB != null) {
           for (Account a : accountDB.getAllAccounts()) {
               if (a.getName().equalsIgnoreCase(name) && a.isActive()) {
                   accountsFound.add(a);
               }
           }
       }

       return accountsFound;
    }

    public AccountDB getAccountDB() {
        return accountDB;
    }

    public void setAccountDB(AccountDB accountDB) {
        this.accountDB = accountDB;
    }

}
