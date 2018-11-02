package com.mikolaj;

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
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("----------------------");
                    System.out.println("Please enter your name: ");
                    String name = sc1.nextLine();
                    System.out.println("Please enter your last name: ");
                    String lastName = sc1.nextLine();
                    System.out.println("Please enter your initial amount: ");
                    double initialAmount = sc1.nextDouble();
                    System.out.println("Please enter currency: ");
                    Scanner sc2 = new Scanner(System.in);
                    String currency = sc2.nextLine();
                    op.Add(name, lastName, initialAmount, currency);
                    Integer number = op.accounts.size();
                    System.out.println("Your account number is: " + number);
                    break;

                case 'B':
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("----------------------");
                    System.out.println("Please enter your account number");
                    Integer number1 = sc3.nextInt();
                    op.showAccountByNumber(number1);

                    break;

                case 'C':
                    System.out.println("---------------------");
                    System.out.println("Below you can see all accounts: ");
                    op.showAll();
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
}
