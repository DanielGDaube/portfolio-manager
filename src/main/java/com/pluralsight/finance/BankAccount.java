package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable{

    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(BigDecimal amount){
        balance.subtract(amount);
    }

    public void deposit(BigDecimal amount){
        balance.add(amount);
    }

    public BigDecimal getValue(){
        return balance;
    }
}
