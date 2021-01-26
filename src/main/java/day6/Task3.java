package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Анна Иванова");
        Teacher teacher = new Teacher("Иван Петров", "История");

        System.out.println("Преподаватель " + teacher.getName()
                + " оценил студента с именем " + student.getName()
                + " по предмету " + teacher.getSubject() + " на оценку "
                + teacher.evaluate(student));

    }
}
