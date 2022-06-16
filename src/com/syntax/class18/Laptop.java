package com.syntax.class18;

public class Laptop {
    String make;
    String model;
    String Storage;
    String memory;
    double screenSize;

    public Laptop(String make) {
        this.make = make;
    }



    public Laptop(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Laptop(String make, String model, String storage) {
        this.make = make;
        this.model = model;
        Storage = storage;

    }

    public Laptop(String make, String model, String storage, String memory) {
        this.make = make;
        this.model = model;
        Storage = storage;
        this.memory = memory;

    }

    public Laptop(String make, String model, String storage, String memory, double screenSize) {
        this.make = make;
        this.model = model;
        Storage = storage;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public static void main(String[] args) {
        Laptop apple=new Laptop("Apple","M1Pro 14","512","16",14.2);

    }
}
