package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int [][] array = new int [m][n];

        for(int i =0; i < m; i++){

            for(int j=0; j < n; j++){
                array[i][j] = (int)(Math.random()*50);
            }
        }
//        for(int i =0; i < m; i++) {
//            System.out.println("");
//
//            for (int j = 0; j < n; j++) {
//
//                System.out.print(array[i][j] + " ");
//            }
//        }

        int sum_ind = 0;
        int sum_ind_max = 0;
        int index = 0;

        for(int i =0; i < m; i++){
            //System.out.println("");
            sum_ind = 0;
            for(int j=0; j < n; j++){
                sum_ind = sum_ind + array[i][j];
            }
            //System.out.println(sum_ind);
            if (sum_ind>sum_ind_max){
                sum_ind_max = sum_ind;
                index = i;
            }

        }
        //System.out.println(sum_ind_max);
        System.out.println(index);
        //System.out.println(Arrays.toString(array));
    }
}
