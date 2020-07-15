package com.company.lesson9;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <String, Integer> hash1 = new HashMap<>();
        hash1.put("first", 1);
        hash1.put("second", 2);
        hash1.put("third", 3);

        System.out.println(hash1.get("first"));
    }
}
