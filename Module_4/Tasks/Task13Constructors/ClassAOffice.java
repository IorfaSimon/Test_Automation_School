package com.Task13Constructors;

public class ClassAOffice {
    int furniture;
    boolean buillt;
    String appliance;

    public ClassAOffice(int Afurniture) {
        this.furniture= Afurniture;
    }
    public ClassAOffice(int Afurniture, boolean Abuilt){
        this.buillt = Abuilt;


    }
    public ClassAOffice(int furniture, boolean Abuilt, String Aappliance){
        this.appliance = Aappliance;

    }
    public void printClassAOffice(){
        System.out.println(furniture);
    }




}
