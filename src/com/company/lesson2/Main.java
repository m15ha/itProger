package com.company.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[3];
        String[] rank = new String[2];
        Integer[] number1 = new Integer[4];

        arrType(rank);
        fullArr(rank);
    }

    public static void fullArr(String[] num) {
        for (String n1 : num
        ) {
            System.out.println(n1);
        }
    }

    public static String[] arrType(String[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Type your " + (i + 1) + ":");
            arr[i] = in.nextLine();
        }
        return arr;
    }
}
