package com.Task16B;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car toyotaCorolla = new Car();
        toyotaCorolla = new Car();
        toyotaCorolla.takesFuel("true");

        toyotaCorolla.hasBody("true");
    }

    public void takesFuel(String aTrue) {
        System.out.println("Car takes fuel");
    }

    public void hasBody(String aTrue) {
        System.out.println("Car has body");


}}