package com.company.lesson6;

public class Excalibre extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
