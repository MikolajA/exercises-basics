package com.isa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {2, 9, 8, 3, 11, 18, 1, 5, 20};
        bubbleSort(numbers);
    }

    public static int[] bubbleSort(int[] array) {

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }
}