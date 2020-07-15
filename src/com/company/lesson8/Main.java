package com.company.lesson8;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Runnable runnable1 = () -> System.out.println("Hello1");
    }
}
