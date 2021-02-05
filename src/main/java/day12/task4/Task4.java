package day12.task4;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.printMembers;
import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {

        List<String> A = new ArrayList<>();

        A.add("an");
        A.add("olga");
        A.add("ivan");

        List<String> B = new ArrayList<>();

        B.add("sally");
        B.add("inga");
        B.add("piter");

        MusicBand band1 = new MusicBand("band1", 1978, A);
        MusicBand band2 = new MusicBand("band2", 1990, B);

        System.out.println(band1.getMembers());

        System.out.println(band2.getMembers());

        transferMembers(band1, band2);

        System.out.println(band1.getMembers());

        System.out.println(band2.getMembers());

        printMembers(A);

    }

}
