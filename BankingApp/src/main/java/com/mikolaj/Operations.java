package com.mikolaj;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    List<Account> accounts = new ArrayList<>();
    List<Integer> idNumbers = new ArrayList<>();

    public void Add(String name, String lastName, Double initialAmount, String currency) {

        Integer number = accounts.size() + 1;
        Account account = new Account(name, lastName, number, initialAmount, currency);
        accounts.add(account);
        idNumbers.add(number);

    }

    public void showAll() {
        accounts.forEach(System.out::println);
    }

    public void showAccountByNumber(Integer number) {

        for (Account account : accounts) {

            if (account.getNumber().equals(number)) {
                System.out.println("---------------------");
                System.out.println("Below you can see the details of your account: ");
                System.out.println("---------------------");
                System.out.println(account);
            }
            if (number <= 0 || number > accounts.size()) {
                System.out.println("Sorry, wrong account number!");
            }
        }
    }

    public void makeTransaction(Integer account1, Integer account2, Double ammount) {

        if (idNumbers.contains(account1) && idNumbers.contains(account2)) {

            for (Account account : accounts) {

                if (account.getNumber().equals(account1)) {
                    double value1 = account.getInitialAmmount() - ammount;
                    account.setInitialAmmount(value1);
                }
                if (account.getNumber().equals(account2)) {
                    double value2 = account.getInitialAmmount() + ammount;
                    account.setInitialAmmount(value2);
                }
            } System.out.println("Transaction successful!");
        } else {
            System.out.println("Something went wrong, please try again!");
        }
    }
}