package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public SavingsAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        if(getBalance() > 150){
            if(getBalance() - amountToWithdraw > 1) {
                super.withdraw(amountToWithdraw);
                if(getBalance() < 150){
                    super.withdraw(2);
                }
        }

    }
        return getBalance();
}
}

