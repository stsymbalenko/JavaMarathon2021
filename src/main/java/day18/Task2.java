package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(-112381));
    }

    public static int count7(int chyslo){
        String str = String.valueOf(chyslo);
        int dov = str.length();
        str = str.replaceFirst("[-,0-6,8,9]", "");
        int dov2 = str.length();
        if(dov!=dov2 && dov2 != 0){
            chyslo=Integer.parseInt(str);
            return count7(chyslo);
        }
            return dov2;
    }
}
