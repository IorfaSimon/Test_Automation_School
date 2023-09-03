package com.Task14;

public class BClass {
    private int length = 5;
    private int breadth = 5;

    BClass(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public BClass(int length) {
        this.length = length;
        this.breadth = breadth;
    }

    // To calculate area of a square(area=l^2 or lengt*breadth where length=breath)
    public void getArea() {
        int area = length * breadth;
        System.out.println("The Area of a square of length 5 and breadth 5 is: " + area +  "m^2");
    }
}

class main {
    public static void main(String[] args) {

        BClass area = new BClass(5, 5);
        area.getArea();
    }
}

