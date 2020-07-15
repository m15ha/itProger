package com.company.lesson6;

public class Main {
    public static void main(String[] args) {
//        Excalibre ex1 = new Excalibre();
//        ex1.start();
//        Excalibre ex2 = new Excalibre();
//        ex2.start();
        Thread ex3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        });
        ex3.start();
        Thread ex4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        });
        ex4.start();
    }
}
