package com.company.testInterface;

public class Male implements HumanInterface, TestInterface{
    private String name;
    private int age;
    private Personality person;

    public Male(String name, int age, Personality person) {
        this.name = name;
        this.age = age;
        this.person = person;
    }

    @Override
    public void talk() {
        System.out.println("Hello");
    }

    @Override
    public void wolk() {
        System.out.println("go");
        System.out.println(this.person);
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int age() {
        return this.age;
    }
}
