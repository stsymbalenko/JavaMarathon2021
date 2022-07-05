package day18;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = {-402,-50,-249,-15,-665,-311};
        int n = 0;
        System.out.println(recursionSum(numbers, n));
    }

    public static int recursionSum(int[] mas, int n){
        if(n < mas.length-1){
            mas[n+1] = mas[n] + mas[n+1];
            return recursionSum(mas, n+1);
        }

        return mas[n];
    }
}