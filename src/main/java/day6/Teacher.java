package day6;

public class Teacher {
        private String name;
        private String thing;

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
                        default:
                                grade = "отлично";
                                break;
                }

                System.out.println( "Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + thing + " на оценку " + grade);
        }
}
