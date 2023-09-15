package com;

import java.util.Scanner;

public class Task18ErrorHandling {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your age :");
            int age = s.nextInt();
            System.out.println("Date of birth :" + age);

        } catch (InputMismatchException) {
            System.out.println("we can add only integers");
        }
    }
}

