package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b){
            System.out.println("Некорректный ввод");
        }else{
            int i = a;
            while (i <= b){
                if(i % 5 == 0 && i % 10 !=0){
                    if(i!=a && i!=b) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                }
                i++;
            }
        }
    }
}
