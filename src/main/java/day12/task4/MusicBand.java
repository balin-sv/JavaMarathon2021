package day12.task4;

import java.util.List;

public class MusicBand {

    private final String name;
    private final Integer year;
    private List<String> members;

    public MusicBand(String name, Integer year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public Integer getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        a.getMembers().addAll(b.getMembers());
        b.getMembers().clear();

    }

    public static void printMembers(List<String> a) {
        for (String string : a) {
            System.out.println("{" + string + "}");
        }
    }

}

