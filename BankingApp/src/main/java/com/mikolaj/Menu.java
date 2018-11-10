package com.mikolaj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void showMenu() {

        Operations op = new Operations();

        char option = 'o';

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome dear user!");
        System.out.println("What do you want to do?");
        System.out.println("=========================");
        System.out.println("A. Add account");
        System.out.println("B. Show account");
        System.out.println("C. Show all accounts");
        System.out.println("D. Make a transaction");
        System.out.println("E. Back to main menu");
        System.out.println("F. Exit");

        do {
            System.out.println("=========================");
            System.out.println("Enter an option (A,B,C,D,E or F)");
            System.out.println("=========================");
            option = sc.next().toUpperCase().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("----------------------");
                    System.out.println("Please enter your name: ");
                    String name = readStringFromUser();
                    System.out.println("Please enter your last name: ");
                    String lastName = readStringFromUser();
                    System.out.println("Please enter currency (PLN, USD, EUR): ");
                    String currency = readCurrencyFroUser();
                    System.out.println("Please enter your initial amount: ");
                    Double initialAmount = readDoubleFromUser();
                    op.Add(name, lastName, initialAmount, currency);
                    Integer number = op.accounts.size();
                    System.out.println("Your account number is: " + number);
                    break;

                case 'B':
                    System.out.println("----------------------");
                    System.out.println("Please enter your account number: ");
                    Integer number1 = readIntegerFromUser();
                    op.showAccountByNumber(number1);
                    break;

                case 'C':
                    System.out.println("---------------------");
                    System.out.println("Below you can see all accounts: ");
                    op.showAll();
                    System.out.println("---------------------");
                    break;

                case 'D':
                    System.out.println("---------------------");
                    System.out.println("Please enter an account number which you want to make transaction from:");
                    Integer acNumber1 = readIntegerFromUser();
                    System.out.println("Please enter an account number which you want to make transaction to:");
                    Integer acNumber2 = readIntegerFromUser();
                    System.out.println("Please enter an ammount:");
                    Double ammount = readDoubleFromUser();
                    op.makeTransaction(acNumber1, acNumber2, ammount);
                    System.out.println("---------------------");
                    System.out.println("Transaction has been done");
                    System.out.println("---------------------");
                    break;

                case 'E':
                    showMenu();
                    break;

                case 'F':
                    System.out.println("**************************");
                    break;

                default:
                    System.out.println("Invalid operation, please try again!");

            }
        } while (option != 'F');
        System.out.println("Bye bye!");
    }

    public static Double readDoubleFromUser() {

        Double input = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                input = new Double(scanner.nextLine());
                if (input < 0) {
                    System.out.print("Something went wrong, please try again!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Something went wrong, please try again!");
            }
        }
        return input;
    }

    public static Integer readIntegerFromUser() {

        Scanner scanner = new Scanner(System.in);
        Integer input = null;

        while (true) {
            try {
                input = new Integer(scanner.nextLine());
                if (input <= 0) System.out.print("Somethig went wrong, please try again!");
                else break;
            } catch (Exception e) {
                System.out.print("Somethig went wrong, please try again!");
            }
        }
        return input;
    }

    public static String readStringFromUser() {

        String input = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                input = new String(scanner.nextLine());
                if (input.isEmpty()) {
                    System.out.println("Something went wrong, please try again!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Something went wrong, please try again!");
            }
        }
        return input;
    }

    public static String readCurrencyFroUser() {

        Scanner scanner = new Scanner(System.in);
        String input = null;

        List<String> options = new ArrayList<>();
        options.add("PLN");
        options.add("USD");
        options.add("EUR");

        while (true) {
            input = scanner.nextLine();
            if (options.contains(input.toUpperCase())) {
                break;
            } else {
                System.out.println("Please select one of the following currency: PLN, USD, EUR");
            }
        }
        return input;
    }
}
