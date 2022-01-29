package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Alex", "Groupe 5");
        Teacher teacher = new Teacher("Ivanov", "Mathematics");

        student.printInfo();
        teacher.printInfo();
    }
}
