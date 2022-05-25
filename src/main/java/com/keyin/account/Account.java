package com.keyin.account;

import java.util.ArrayList;

public class Account {
    private int balance;

    private ArrayList<Object> list = new ArrayList<Object>();

    public int getBalance() {
        return balance;
    }

    public int credit(int amountToCredit) {
        balance += amountToCredit;
        return balance;
    }

    public int debit(int amountToDebit) throws AccountBalanceException {
        if (0 > (balance - amountToDebit)) {
            throw new AccountBalanceException("Amount to debit causes negative balance!!  Transaction cancled!");
        }

        balance -= amountToDebit;
        return balance;
    }
}
