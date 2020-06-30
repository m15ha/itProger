package com.company.lesson3;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
}
