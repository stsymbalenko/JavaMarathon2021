package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        try {
            System.out.println(parseFileToObjList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (Exception e1){
            System.out.println("Некорректный входной файл");
        }

    }

    public static List<Person> parseFileToObjList(File file) throws Exception {
        List<Person> personList = new ArrayList<>();

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String line  = scanner.nextLine();
            String [] personString = line.split(" ");
            int year = Integer.parseInt(personString[1]);
            if(0<year){
                personList.add(new Person(personString[0], year));
            }else{
                personList.clear();
                throw new Exception();

            }


        }
        scanner.close();

        return personList;
    }
}
