package com.simon;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Welcome, Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Welcome,Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Welcome,Enter the Time period : ");
        t = s.nextFloat();
        float si;
        si = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + si);
    }
}
