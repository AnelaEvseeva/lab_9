package com.company;
import java.util.ArrayList;

public class Garage {
    private ArrayList<Auto> masCar = new ArrayList<Auto>();
    public void addCar(Auto m){
        masCar.add(m);
    }
    public Garage() {
    }
    public Boolean findCar (Auto m){
        return masCar.contains(m);
    }
    public Garage(ArrayList<Auto> n){
        masCar=n;
    }
    public void printGarage(){
        System.out.println("В гараже: ");
        for (Auto a:masCar){
            System.out.println("\t"+a.toString());
        }
    }
}
