package day4;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] m = new int[n];
        for (int i = 0; i < n; i++){
            m [i]= (int)(Math.random()*10);
        }
        int k8=0;
        int k1=0;
        int kch=0;
        int kn=0;
        int sum=0;
        for (int x: m){
            System.out.print(x + " ");
            if(x>8){
                k8++;
            }
            if(x==1){
                k1++;
            }
            if(x%2==0){
                kch++;
            }else{
                kn++;
            }
            sum = sum+x;
        }

        System.out.println("");
        System.out.println("Длине массива: " + m.length);
        System.out.println("Количестве чисел больше 8: " + k8);
        System.out.println(" Количестве чисел равных 1: " + k1);
        System.out.println("Количестве четных чисел: " + kch);
        System.out.println("Количестве нечетных чисел: " + kn);
        System.out.println("Сумме всех элементов массива: " + sum);

    }
}
