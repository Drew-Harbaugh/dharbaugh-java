package com.techelevator;

public class BankAccount {

    private String accountNumber;
    private int balance;
    private String accountHolderName;


    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public int getBalance(){
        return balance;
    }

    public int deposit(int amountToDeposit){
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        return balance;
    }




}
