package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("GFSD", 2000));
        list.add(new MusicBand("DFG", 2005));
        list.add(new MusicBand("DFSD", 1990));
        list.add(new MusicBand("WERQ", 1985));
        list.add(new MusicBand("AFGS", 2010));
        list.add(new MusicBand("FGSF", 2007));
        list.add(new MusicBand("YHU", 1993));
        list.add(new MusicBand("EPW", 1997));
        list.add(new MusicBand("FGS", 1998));
        list.add(new MusicBand("AAA", 1998));
        list.add(new MusicBand("BBB", 2003));
        list.add(new MusicBand("CCC", 2001));

        Collections.shuffle(list);

        System.out.println("original list");

        for (MusicBand musicBand : list) {
            System.out.println(musicBand.getYear());

        }

        list = groupsAfter2000(list);

        System.out.println("modified list");

        for (MusicBand musicBand : list) {
            System.out.println(musicBand.getYear());
        }

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> a) {
        List<MusicBand> listModified = new ArrayList<>();

        for (MusicBand musicBand : a) {
            if (musicBand.getYear() > 2000) {
                listModified.add(musicBand);
            }
        }

        return listModified;

    }

}
