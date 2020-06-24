package com.company.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println("Type your age");
        Scanner in = new Scanner(System.in);
        int in1 = 10;
        switch (in1) {
            case 10:
                System.out.println("10");
                break;

            case 11:
                System.out.println("10");
                break;
        }

        int a = 2;
        int b = 3;
        int res = a < b ? (a + b) : (a - b);
        System.out.println(res);
        String[] arr1 = new String[3];
        arr1[0] = "Mike";
        arr1[1] = "Bob";
        System.out.println(arr1[0]);
*/

       /* int age = in.nextInt();
        if (age > 18){
            System.out.println("Your age is more 18+");
        } else if (age < 18){
            System.out.println("less 18");
        } else System.out.println("Go home");*/

/*        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("C");
        for (String w1: words
             ) {
            System.out.println(w1);
        }*/

        String[] names = new String[]{"Mike", "Bob", "Dany"};
        String[] rank = new String[]{"Sniper", "Pusher", "Victim"};

        int mikeAge = 18;
        fullArr(mikeAge, names);
    }
        public static void fullArr(int age, String[] arr){
            System.out.println("You skill level is " + age);
        /*    for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }*/
            for (String ar1: arr
                 ) {
                System.out.println(ar1);
            }
        }
    }

