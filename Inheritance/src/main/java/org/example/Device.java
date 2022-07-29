package org.example;

public class Device {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();

        Car ford = new Car();

        ford.start();
        ford.wipeWindShield();
        ford.stop();
    }
}