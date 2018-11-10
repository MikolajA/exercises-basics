package com.mikolaj;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    List<Account> accounts = new ArrayList<>();

    public void Add(String name, String lastName, Double initialAmount, String currency) {

        Integer number = accounts.size() + 1;
        Account account = new Account(name, lastName, number, initialAmount, currency);
        accounts.add(account);

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
                System.out.println("Oops, something went wrong, please try again!");
            }
        }
    }

    public void makeTransaction(Integer account1, Integer account2, Double ammount) {

        for (Account account : accounts) {

            if (account.getNumber().equals(account1)) {
                double v = account.getInitialAmmount() - ammount;
                account.setInitialAmmount(v);
            }
            if (account.getNumber().equals(account2)) {
                double x = account.getInitialAmmount() + ammount;
                account.setInitialAmmount(x);
            }
        }
    }
}
