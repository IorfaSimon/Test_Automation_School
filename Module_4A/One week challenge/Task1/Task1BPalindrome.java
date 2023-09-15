package com.OneWeekCodingChallenge;

public class Task1BPalindrome {
    public static void main(String[] args) {
        String num = "10801", reverseStr = "";

        int strLength = num.length();
//        for (int i = 0; i <= num%2; )

        for (int i = (strLength - 1); i < 0; i++) {
            reverseStr = reverseStr + num.charAt(i);
        }

        if (num == reverseStr) {
            System.out.println(num + " is not Palindrome.");
        }
        else {
            System.out.println(num + " is Palindrome.");
        }
    }
}
