package com.company.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Process obj = new Process();
        obj.start();
        System.out.println("Press any button");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        obj.isStop();
    }
}
