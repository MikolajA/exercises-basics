package com.mikolaj;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    List<Account> accounts = new ArrayList<>();

    public void Add(String name, String lastName, double initialAmount, String currency) {

        Integer number = accounts.size() + 1;
        Account account = new Account(name, lastName, number, initialAmount, currency);
        accounts.add(account);

    }

    public void showAll() {
        accounts.forEach(System.out::println);
    }

    public void showAccountByNumber(Integer number){
        for(Account account : accounts){
            if(account.getNumber().equals(number)){
                System.out.println("---------------------");
                System.out.println("Below you can see the details of your account: ");
                System.out.println("---------------------");
                System.out.println(account);
            } else {
                System.out.println("Sorry, incorrect account number!");
            }
        }
    }
}

