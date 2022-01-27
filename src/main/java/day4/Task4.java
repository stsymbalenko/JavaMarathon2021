package day4;

public class Task4 {
    public static void main(String[] args) {
        int n = 100;
        int []array = new int[n];

        for(int i =0; i < n; i++){
            array[i] = (int)(Math.random()*10000);
        }

        int sum_three = 0;
        int sum_three_max = 0;
        int index = 0;
        int index_sum= 0;
        for(int i =0; i<n-2;i++){
            sum_three= 0;
            index = i;

            for(int j=0; j<3;j++){
                sum_three = sum_three+ array[i];
                    i++;
                }

            //System.out.println(sum_three);
            if(sum_three> sum_three_max){
                sum_three_max = sum_three;
                index_sum = i-3;             }
            i= index;
        }
        System.out.println("значение суммы: " + sum_three_max);
        System.out.println(" индекс первого элемента тройки: " + index_sum);
    }
}
