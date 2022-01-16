package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc_ch = new Scanner(System.in);
        int ch = sc_ch.nextInt();
        if(ch<=0){
            System.out.println("Ошибка ввода");
        }else if (1 <= ch && ch <= 4){
            System.out.println("Малоэтажный дом");
        }else if(5 <= ch && ch <= 8){
            System.out.println("Среднеэтажный дом");
        }else if (9 <= ch){
            System.out.println("Многоэтажный дом");
        }

    }
}
