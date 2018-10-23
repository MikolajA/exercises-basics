package com.mikolaj;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    public List<Account> accounts = new ArrayList<>();

    public void Add(String name, String lastName, double initialAmount, String currency) {

        Integer number = accounts.size() + 1;
        accounts.add(new Account(name, lastName, number, initialAmount, currency));

    }

    public void showAll() {
        accounts.forEach(System.out::println);
    }
}

