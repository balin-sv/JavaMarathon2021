package day9.Task1;

public class Teacher extends Human {

    private final String subjectName;

    public Teacher(String subjectName, String name) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

}
