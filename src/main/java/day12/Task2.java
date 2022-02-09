package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //int i = 0;
            /*while(i <= 350){
                if(!(!(30>=i) && !(i>=300))){
                    list.add(i);
                }
                i = i +2;
            }*/

        Task2.dChisla(list, 0,30);
        Task2.dChisla(list, 300,350);
        System.out.println(list);
    }



    public static List<Integer> dChisla(List<Integer> list, int a, int b){
        for(int i = a; i <= b; i = i+2){
            list.add(i);
        }
        return list;
    }
}
