package com.isa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        commonDivisors();
    }

    public static void commonDivisors() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza dodatnia liczbe calkowita: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga dodatnia liczbe calkowita: ");
        int liczba2 = scanner.nextInt();

        Set<Integer> wsp = new HashSet<>();

        for (int i = 1; i <= liczba1; i++) {
            if (liczba1 % i == 0 && liczba2 % i == 0) {
                wsp.add(i);
            }
        }
        System.out.println("Wspolne dzielniki powyzszych liczb to: " + wsp);
    }
}
