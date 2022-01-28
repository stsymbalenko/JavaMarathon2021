package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex", "Mathematics");
        Student student = new Student("Ivanov");

        teacher.evaluate(student);
    }
}
