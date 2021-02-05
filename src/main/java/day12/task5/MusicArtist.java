package day12.task5;

public class MusicArtist {

    private final String name;
    private final Integer age;
    MusicBand nameOfBand;

    public MusicArtist(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Age: " + getAge();
    }

}
