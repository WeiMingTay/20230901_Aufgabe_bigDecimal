package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<String, Account> accounts;
    private int accountNumberCounter;

    public BankService() {
        accounts = new HashMap<>();
        accountNumberCounter = 1;
    }
    public String openAccount(Client client) {
        String accountNumber = generateAccountNumber();
        Account account = new Account(accountNumber, client);
        accounts.put(accountNumber, account);
        return accountNumber;
    }

    private String generateAccountNumber() {
        return String.format("1234"+"%04d", accountNumberCounter++);
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, BigDecimal amount) {
        Account fromAccount = accounts.get(fromAccountNumber);
        Account toAccount = accounts.get(toAccountNumber);

        fromAccount.withdrawel(amount);
        toAccount.deposit(amount);
    }


    public BankService(Map<String, Account> accounts, int accountNumberCounter) {
        this.accounts = accounts;
        this.accountNumberCounter = accountNumberCounter;
    }

    @Override
    public String toString() {
        return "BankService{" +
                "accounts=" + accounts +
                ", accountNumberCounter=" + accountNumberCounter +
                '}';
    }
}
