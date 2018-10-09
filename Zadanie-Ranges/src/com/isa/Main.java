package com.isa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilosc liczb: ");
        int x = scanner.nextInt();
        System.out.println("Podaj ilosc przedzialow: ");
        int y = scanner.nextInt();
        System.out.println("Podaj zakres liczb: ");
        int z = scanner.nextInt();

        int przedzial = z / y;

        int[] wynikLosowania = new int[x];

        Random random = new Random();

        for (int i = 0; i < x; i++) {

            wynikLosowania[i] = random.nextInt(z);

        }

        System.out.println("Wylosowane liczby z wybranego zakresu to: " + Arrays.toString(wynikLosowania));

        int count = 0;

        for (int i = 0; i < y; i++) {

            for (int j = 0; j < x; j++) {

                if ((wynikLosowania[j] >= i * przedzial) && (wynikLosowania[j] <= (i * przedzial + przedzial))) {
                    count++;
                }
            }

            System.out.println("Z przedzialu nr " + (i + 1) + " od: " + (i * przedzial) + " do " + ((i * przedzial) + przedzial) + " wylosowano " + count + " liczb.");
        }
    }
}
