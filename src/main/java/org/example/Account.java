package org.example;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal balance;

    private Client client;


    //Methoden
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }
    public void withdrawel(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    // Konstruktor
    public Account() {}
    public Account(String accountNumber, Client client) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
        this.client = client;
    }
    public Account(String accountNumber, BigDecimal balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    // Getter und Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Equals und HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;

        if (getAccountNumber() != null ? !getAccountNumber().equals(account.getAccountNumber()) : account.getAccountNumber() != null)
            return false;
        if (getBalance() != null ? !getBalance().equals(account.getBalance()) : account.getBalance() != null)
            return false;
        return getClient() != null ? getClient().equals(account.getClient()) : account.getClient() == null;
    }

    @Override
    public int hashCode() {
        int result = getAccountNumber() != null ? getAccountNumber().hashCode() : 0;
        result = 31 * result + (getBalance() != null ? getBalance().hashCode() : 0);
        result = 31 * result + (getClient() != null ? getClient().hashCode() : 0);
        return result;
    }

    // toString
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }



}
