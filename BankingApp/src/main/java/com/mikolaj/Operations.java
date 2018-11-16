package com.mikolaj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        for (Account account : accounts) {
            if (accounts.size() != 0) {
                System.out.println("\n");
                System.out.println("Account number: " + account.getNumber());
                System.out.println("Name: " + account.getName());
                System.out.println("Last name: " + account.getLastName());
                System.out.println("Current balance: " + account.getInitialAmmount() + " " + account.getCurrency());
            } else {
                System.out.println("Sorry there is no accounts created");
            }
        }
    }

    public void showAccountByNumber(Integer number) {

        for (Account account : accounts) {

            if (account.getNumber().equals(number)) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("Below you can see the details of your account: ");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("\n");
                System.out.println("Account number: " + account.getNumber());
                System.out.println("Name: " + account.getName());
                System.out.println("Last name: " + account.getLastName());
                System.out.println("Current balance: " + account.getInitialAmmount() + " " + account.getCurrency());
            }
            if (number <= 0 || number > accounts.size() + 1) {
                System.out.println("Sorry, wrong account number!");
            }
        }
    }

    public void makeTransaction(Integer account1, Integer account2, Double ammount) {

        if (idNumbers.contains(account1) && idNumbers.contains(account2)) {

            String curr1 = accounts.get(account1 - 1).getCurrency();
            String curr2 = accounts.get(account2 - 1).getCurrency();

            for (Account account : accounts) {

                if (account.getNumber().equals(account1)) {
                    double value1 = account.getInitialAmmount() - ammount;
                    account.setInitialAmmount(value1);
                }
                if (account.getNumber().equals(account2)) {

                    if (curr1.equals("PLN") && curr2.equals("USD")) {
                        double value2 = account.getInitialAmmount() + (ammount / 3.75);
                        account.setInitialAmmount(value2);
                    } else if (curr1.equals("USD") && curr2.equals("PLN")) {
                        double value2 = account.getInitialAmmount() + (ammount * 3.75);
                        account.setInitialAmmount(value2);
                    } else {
                        double value2 = account.getInitialAmmount() + ammount;
                        account.setInitialAmmount(value2);
                    }
                    System.out.println("Transaction successful!");
                }
            }
        } else {
            System.out.println("Something went wrong, please try again!");
        }
    }

    public void openFile() throws NumberFormatException {
        BufferedReader reader = null;
        try {
            accounts.clear();
            idNumbers.clear();
            reader = new BufferedReader(new FileReader("/home/mikolaj/Projekty/exercises-basics/BankingApp/AccountsExamples.csv"));
            List<Account> ac = reader.lines()
                    .skip(1)
                    .map(s -> s.split(";"))
                    .map(array -> new AccountBuilder()
                            .withName(array[0])
                            .withLastName(array[1])
                            .withNumber(Integer.parseInt(array[2]))
                            .withInitialAmmount(Double.parseDouble(array[3]))
                            .withCurrency(array[4])
                            .makeAnAccount())
                    .collect(Collectors.toList());
            accounts.addAll(ac);
            for (int i = 0; i < accounts.size(); i++) {
                idNumbers.add(i);
            }

        } catch (FileNotFoundException e) {
            throw new NumberFormatException();
        }
    }
}