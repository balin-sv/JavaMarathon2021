package day6;

public class Teacher {

    private final String name;
    private final String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    String result;

    public String evaluate(Student a) {
        int evaliation;
        evaliation = (int) (Math.random() * 4) + 2;
        switch (evaliation) {
            case 2:
                result = "неудовлетворительно";
                break;
            case 3:
                result = "удовлетворительно";
                break;
            case 4:
                result = "хорошо";
                break;
            case 5:
                result = "отлично";
                break;
        }
        return result;
    }

}
