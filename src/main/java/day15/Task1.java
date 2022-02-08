package day15;

import day14.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File infile = new File("src/main/resources/shoes.csv");
        File outfile = new File("src/main/resources/missing_shoes.txt");

        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            scanner = new Scanner(infile);
            printWriter = new PrintWriter (outfile);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        if (scanner.hasNextLine()!=false) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                    String[] strString = line.split(";");
                    int length = strString.length;
                    int number = Integer.parseInt(strString[2]);
                    if (0 == number) {
                        for(int i = 0; i<length; i++){
                            printWriter.print(strString[i]);
                            if(i != length-1){
                                printWriter.print(", ");
                            }
                        }
                        printWriter.println("");

                    }
            }
        }else{
            System.out.println("Пустой файл");
        }


        printWriter.close();
        scanner.close();
    }
}
