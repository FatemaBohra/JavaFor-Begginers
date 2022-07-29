package org.example;

public class Car extends Machine{
    @Override
    public void start(){
        System.out.println("Car started.");
    } //overridden - car version from machine version
    public void wipeWindShield(){
        System.out.println("Wiping wind shield");
    }
}
