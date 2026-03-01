package com.mycompany.palindromecheckerapp;

class PalindromeChecker {

    boolean check(String input) {
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}

public class UC11_OOPPalindrome {

    public static void main(String[] args) {

        PalindromeChecker obj = new PalindromeChecker();
        String input = "level";

        if (obj.check(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}