package com.company.lesson7;

public class Process extends Thread{
    public volatile boolean isRun = true;
    public void run (){
        while (isRun){
            System.out.println("Test");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void isStop(){
        isRun = false;
    }
}
