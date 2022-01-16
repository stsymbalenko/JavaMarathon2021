package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] m = new  int[100];
        for (int i =0; i < 100; i++){
            m[i] = (int)(Math.random()*1000);
        }

        int nbe=m[0];
        int nme=m[0];
        int k0=0;
        int sum0 = 0;

        for(int x:m){

            System.out.println(x);
            if(x>nbe){
                nbe = x;
            }

            if(x<nme){
                nme = x;
            }
            if(x%10==0){
                k0++;
                sum0 = sum0 +x;
            }
        }
        System.out.println("наибольший элемент массива: " + nbe);
        System.out.println("наименьший элемент массива: " + nme);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + k0);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum0);



    }
}
