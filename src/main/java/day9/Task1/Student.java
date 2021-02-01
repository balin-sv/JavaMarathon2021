package day9.Task1;

public class Student extends Human {

    private final String groupName;

    public Student(String groupName, String name) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    /**
     *
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }

}

