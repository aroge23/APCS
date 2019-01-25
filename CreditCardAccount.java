package com.company;

public class CreditCardAccount {
    private String name;
    String creditCardCompany;
    String bank;
    private int accountNumber;
    int expiration;
    int securityCode;

    //Getters/Setters
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int newAcctN) {
        accountNumber = newAcctN;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    //Constructors
    public CreditCardAccount() {
    }
    public CreditCardAccount(String newName, int newAccountNumber) {
        setName(newName);
        setAccountNumber(newAccountNumber);
    }
}
