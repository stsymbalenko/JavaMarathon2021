package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        printResult(file);
    }

    public static void printResult(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line  = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int counter = 0;
        int sum = 0;

        for(String number:numbersString){
            sum = sum + Integer.parseInt(number);
            counter++;
        }

        System.out.print((double) sum/counter + " --> ");
        System.out.printf("%.3f", (double) sum/counter);
    }
}

