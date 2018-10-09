package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj wejsciowego stringa: ");
        Scanner sc = new Scanner(System.in);
        String enter = sc.nextLine();
        String enter1 = enter.trim().toLowerCase();

        StringBuilder sb = new StringBuilder();
        String alfabet = "";

        for(int c=97; c<=122; c++){
            alfabet = sb.append((char) c).toString();
        }
       
        for(int i =0; i<enter1.length(); i++){
            for(int j=0; j<alfabet.length(); j++){
                if((enter1.charAt(i))==alfabet.charAt(j)){
                    alfabet = sb.deleteCharAt(j).toString();
                }
            }
        }  System.out.println(alfabet);
    }
}