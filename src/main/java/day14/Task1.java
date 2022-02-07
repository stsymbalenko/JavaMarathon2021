package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (Exception e1){
            System.out.println("Некорректный входной файл");
        }
    }

    public static void printSumDigits(File file) throws Exception {
            Scanner scanner = new Scanner(file);
            String line  = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int counter = 0;
            int sum = 0;

            for(String number:numbersString){
                sum = sum + Integer.parseInt(number);
                counter++;
            }


            if( 10 < counter || counter < 10){
                throw new Exception();
            }

        System.out.println(sum);
    }
}
