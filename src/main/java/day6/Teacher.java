package day6;

public class Teacher {
        String name;
        String thing;

        public Teacher(String name, String thing) {
                this.name = name;
                this.thing = thing;
        }

        void evaluate(Student student){
                int g =  2 + (int)(Math.random()*5);
                String grade;

                switch (g){
                        case 2:
                                grade = "неудовлетворительно";
                                break;
                        case 3:
                                grade = "удовлетворительно";
                                break;
                        case 4:
                                grade = "хорошо";
                                break;
                        case 5:
                                grade = "отлично";
                                break;


                        default:
                                throw new IllegalStateException("Unexpected value: " + g);
                }

                System.out.println( "Преподаватель " + name + " оценил студента с именем " + student.name + " по предмету " + thing + " на оценку " + grade);
        }
}
