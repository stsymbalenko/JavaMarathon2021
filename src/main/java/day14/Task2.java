package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        try {
            System.out.println(parseFileToStringList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (Exception e1){
            System.out.println("Некорректный входной файл");
        }

    }
    public static List<String> parseFileToStringList(File file) throws Exception {
        List<String> peopleList = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String line  = scanner.nextLine();
            String [] numbersString = line.split(" ");
            int age = Integer.parseInt(numbersString[1]);
            if(0<age){
             peopleList.add(line);
            }else{
                peopleList.clear();
                throw new Exception();
            }
        }
        scanner.close();
        return peopleList;
    }
}
