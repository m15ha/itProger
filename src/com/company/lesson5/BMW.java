package com.company.lesson5;

public class BMW extends Car{
    String generation;
    int wheels;

    public BMW(String model, int speed, int year, boolean isWorking, String generation, int wheels) {
        super(model, speed, year, isWorking);
        this.generation = generation;
        this.wheels = wheels;
    }

    @Override
    void printAll() {
        super.printAll();
        System.out.println(this.generation + this.wheels);
    }

    @Override
    void startEngine() {
        System.out.println("Go go go");
    }
}
