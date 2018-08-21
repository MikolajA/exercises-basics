package com.isa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy nr. 1: ");
        int tab1 = scanner.nextInt();
        Integer[] tablica1 = new Integer[tab1];
        for (int i = 1; i <= tab1; i++) {
            System.out.println("Podaj liczbe " + i + ": ");
            int liczba = scanner.nextInt();
            tablica1[i - 1] = liczba;
        }

        System.out.println("Podaj rozmiar tablicy nr. 2: ");
        int tab2 = scanner.nextInt();
        Integer[] tablica2 = new Integer[tab2];
        for (int i = 1; i <= tab2; i++) {
            System.out.println("Podaj liczbe " + i + ": ");
            int liczba = scanner.nextInt();
            tablica2[i - 1] = liczba;
        }

        Object[] tablica3 = Stream.concat(Arrays.stream(tablica1), Arrays.stream(tablica2)).toArray();
        List<Object> list = Arrays.stream(tablica3).distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
    }
}
