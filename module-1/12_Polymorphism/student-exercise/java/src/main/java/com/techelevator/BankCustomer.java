package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {


    @Override
    public int getBalance() {
        return 0;
    }


    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public boolean isVip() {
        int total = 0;
        int vipAmount = 25000;
        for (Accountable account : accounts) {
            total = total + account.getBalance();
        }
        if (total >= vipAmount) {
            return true;
        }
        return false;
    }


    public Accountable[] getAccounts() {
        Accountable[] array = new Accountable[accounts.size()];
        return accounts.toArray(array);
    }


    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

}





