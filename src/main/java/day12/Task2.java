package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
            while(i <= 350){
                if(!(!(30>=i) && !(i>=300))){
                    list.add(i);
                }
                i = i +2;
            }

        System.out.println(list);
    }
}
