package com.Task19Keyword;

public class KeywordSuper extends BallKeyword {
    String name = "Anderson";

    public static void main(String[] args) {
        KeywordSuper name = new KeywordSuper();
        name.printName();
    }
    public void printName(){
         System.out.println("My parent name is "+ name);


     }


}
