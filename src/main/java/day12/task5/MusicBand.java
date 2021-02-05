package day12.task5;

import java.util.List;

public class MusicBand {

    private final String name;
    private final Integer year;
    private List<MusicArtist> list;

    public MusicBand(String name, Integer year, List<MusicArtist> list) {
        this.name = name;
        this.year = year;
        this.list = list;
    }

    public List<MusicArtist> getList() {
        return list;
    }

    public void setList(List<MusicArtist> list) {
        this.list = list;
    }

    public Integer getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public static void printMembers(List<String> a) {
        for (String string : a) {
            System.out.println("{" + string + "}");
        }
    }

    public static void transferMembers(MusicBand a, MusicBand b) {

        a.getList().addAll(b.getList());
        b.getList().clear();

    }

}
