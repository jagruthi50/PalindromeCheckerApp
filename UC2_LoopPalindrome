package com.mycompany.palindromecheckerapp;

public class UC2_LoopPalindrome {

    public static void main(String[] args) {

        String input = "level";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
