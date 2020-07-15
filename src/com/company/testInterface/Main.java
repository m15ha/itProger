package com.company.testInterface;

public class Main {
    public static void main(String[] args) {
        Male bob = new Male("Bobby", 23, Personality.MALE);
        bob.talk();
        bob.wolk();
        System.out.println(bob.name());
        System.out.println(bob.age());
    }
}
