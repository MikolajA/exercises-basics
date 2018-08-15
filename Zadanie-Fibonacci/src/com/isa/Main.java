package com.isa;

public class Main {

    public static void main(String[] args) {

        System.out.println(Fibonacci(19));
    }

    public static long Fibonacci(int number) {

        if (number <= 1) {
            return number;
        } else {
            return Fibonacci(number - 1) + Fibonacci(number - 2);
        }
    }
}
