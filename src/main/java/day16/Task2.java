package day16;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        PrintWriter printWriter1 = null;
        try {
            printWriter1 = new PrintWriter(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int ch = 0;
        for (int i = 0; i < 1000; i++) {
            ch= (int)(Math.random() * 100);
            printWriter1.print(ch);
            printWriter1.print(" ");
        }
        printWriter1.close();

        Scanner scanner = null;
        try {
            scanner = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int counter = 0;
            double sum = 0;

        PrintWriter printWriter2 = null;
        try {
            printWriter2 = new PrintWriter(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

            for (String number : numbersString) {
                if (counter < 20) {
                    sum = sum + Double.parseDouble(number);
                    counter++;
                } else {
                    printWriter2.print(sum / 20);
                    printWriter2.print(" ");
                    counter = 0;
                    sum = 0;
                    sum = sum + Double.parseDouble(number);
                    counter++;
                }
            }
            printWriter2.close();

            printResult(file2);
        }


    public static void printResult(File file){
        double sum = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        for (String number : numbersString) {
                sum = sum + Double.parseDouble(number);
        }
        System.out.println((int)sum);
    }
}