package com.isa;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome("xanax"));

        System.out.println(isPalindrome2("Mikolaj"));

    }

    //1 option

    public static boolean isPalindrome(String palindrome) {

        return palindrome.equals(new StringBuilder().append(palindrome).reverse().toString());
    }

    //2 option

    public static boolean isPalindrome2(String palindrome) {

        String reverse = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse = reverse + palindrome.charAt(i);
        }
        if (palindrome.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
