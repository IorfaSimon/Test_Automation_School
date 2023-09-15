package com.OneWeekCodingChallenge;

public class Task1APalindrome {
    public static void main(String[] args) {

        String word = "racecar", reverseStr = "";

        int strLength = word.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + word.charAt(i);
        }

        if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(word + " is a Palindrome.");
        }
        else {
            System.out.println(word + " is not a Palindrome.");
        }



    }
}





