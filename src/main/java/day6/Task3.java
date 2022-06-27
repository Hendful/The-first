package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Уолтер Уайт", "химия");
        Student student = new Student("Джесси Пинкман");

        teacher.evaluate(student);
    }
}

class Teacher {
    private String name;
    private String object;
    Random random = new Random();

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    void evaluate(Student student) {
        int randomValue = random.nextInt(4) + 2;
        String evaluate = "";
        if (randomValue == 5) {
            evaluate = "отлично";
        } else if (randomValue == 4) {
            evaluate = "хорошо";
        } else if (randomValue == 3) {
            evaluate = "удовлетворительно";
        } else if (randomValue == 2) {
            evaluate = "неудовлетворительно";
        }
        System.out.println("Преподователь " +name+ " оценил студента с именем "
                +student.getName()+ " по предмету " +object+ " на оценку " +evaluate);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
