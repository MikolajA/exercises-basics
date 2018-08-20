package com.isa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe w postaci dziesietnej: ");
        Integer liczba = scanner.nextInt();
        System.out.println("Postac binarna to: " + liczba.toBinaryString(liczba));
        System.out.printf("Postac szestastkowa to: %x", liczba);
    }
}
