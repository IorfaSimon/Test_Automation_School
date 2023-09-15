package com.OneWeekCodingChallenge;

public class Task2ReversePosition {
    public static void main(String[] args) {



        String input = "I am the best AutomationTester";
        String s[] = input.split(" ");
        String res = "";
        for (int i = s.length - 1; i >= 0; i--) {
            res += s[i] + " ";
        }

        System.out.println(res.substring(0, res.length() - 1));
    }
}




