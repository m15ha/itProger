package com.company.lesson4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String context = readFile();
        try {
            PrintWriter pw = new PrintWriter(file);
            System.out.println("Please type something: ");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            context += line;
            pw.print(context);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(readFile());
    }

    public static String readFile() {
        BufferedReader br = null;
        String result = "";
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            String line = "";
            while ((line = br.readLine()) != null) {
                result += line + "\n";
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
