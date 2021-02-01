package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("Boris");
        human.printInfo();
        Student student = new Student("A group", "Olga");
        student.printInfo();
        Teacher teacher = new Teacher("Geografia", "Anna Ivanovna");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
