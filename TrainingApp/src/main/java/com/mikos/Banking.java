package com.mikos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public Banking(String customerName, String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }

    public void showBalance(){
        System.out.println("Balance = " + balance);
    }

    public void deposit(int ammount){
        if(ammount>0){
            balance=balance+ammount;
            previousTransaction=ammount;
            System.out.println("Transaction successful!");
        } else  {
            System.out.println("Entered amount has to be greater than 0");
        }
    }

    public void withdrawn(int ammount){
        if(ammount>0){
            balance=balance-ammount;
            previousTransaction= -ammount;
            System.out.println("Transaction successful!");
        } else {
            System.out.println("Entered amount has to be greater than 0");
        }
    }

    public void getPreviousTransaction(){
        if(previousTransaction>0){
            System.out.println("Previous Transaction - Deposit: "+previousTransaction);
        }
        else if(previousTransaction<0){
            System.out.println("Previous transaction - Withdrawn: "+ Math.abs(previousTransaction));
        }
        else {
            System.out.println("No transaction occured");
        }
    }

    public void showMenu(){

        char option = 'o';

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is: "+customerId);
        System.out.println("\n");
        System.out.println("What do you want to do?");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Back to main Menu");
        System.out.println("F. Exit");

        do{
            System.out.println("================================");
            System.out.println("Enter an option (A,B,C,D,E or F)");
            System.out.println("================================");
            option = sc.next().toUpperCase().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("---------------------------");
                    showBalance();
                    System.out.println("---------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("----------------------------");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("----------------------------");
                    try{
                        Scanner sc1 = new Scanner(System.in);
                        int amountDeposit = sc1.nextInt();
                        deposit(amountDeposit);
                    } catch (InputMismatchException e){
                        System.out.println("Wrong format, please enter a number!");
                    }
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("----------------------------");
                    System.out.println("Enter an amount to withdrawn:");
                    System.out.println("----------------------------");
                    try {
                        Scanner sc2 = new Scanner(System.in);
                        int amountWithdrawn = sc2.nextInt();
                        withdrawn(amountWithdrawn);
                    } catch (InputMismatchException e){
                        System.out.println("Wrong format, please enter a number!");
                    }
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("----------------------------");
                    getPreviousTransaction();
                    System.out.println("----------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    showMenu();

                case 'F':
                    System.out.println("**********************************");
                    break;

                    default:
                        System.out.println("Invalid option! Please enter again");
            }
        } while (option!='F');
        System.out.println("Thank you for using our services");
    }
}
