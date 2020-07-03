package com.company.lesson5;

abstract class Car {
    String model;
    int speed;
    int year;
    boolean isWorking;

    public Car(String model, int speed, int year, boolean isWorking) {
        this.model = model;
        this.speed = speed;
        this.year = year;
        this.isWorking = isWorking;
    }

    public Car() {
    }

    void printAll() {
        String isWorking = this.isWorking ? "Na hodu" : "Ne Na hodu";
        System.out.println(this.model + " " + this.speed + " " + this.year + " " + isWorking);
    }

    abstract void startEngine();
}
