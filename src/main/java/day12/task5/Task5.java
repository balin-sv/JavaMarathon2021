package day12.task5;

import static day12.task5.MusicBand.transferMembers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sv
 */
public class Task5 {

    public static void main(String[] args) {

        List<MusicArtist> A = new ArrayList<>();
        List<MusicArtist> B = new ArrayList<>();

        MusicBand band1 = new MusicBand("banb1", 1978, A);
        MusicBand band2 = new MusicBand("banb2", 1990, B);

        MusicArtist A1 = new MusicArtist("an", 24);
        MusicArtist A2 = new MusicArtist("olga", 28);
        MusicArtist A3 = new MusicArtist("ivan", 24);

        A.add(A1);
        A.add(A2);
        A.add(A3);

        MusicArtist B1 = new MusicArtist("sally", 35);
        MusicArtist B2 = new MusicArtist("inga", 29);
        MusicArtist B3 = new MusicArtist("piter", 40);

        B.add(B1);
        B.add(B2);
        B.add(B3);

        System.out.println("//////////////");

        for (MusicArtist musicArtist : B) {
            System.out.println(musicArtist.toString());
        }

        System.out.println("//////////////");

        for (MusicArtist musicArtist : A) {
            System.out.println(musicArtist.toString());
        }

        transferMembers(band1, band2);

        System.out.println("//////////////");

        for (MusicArtist musicArtist : A) {
            System.out.println(musicArtist.toString());

        }
        System.out.println("//////////////");

        for (MusicArtist musicArtist : B) {
            System.out.println(musicArtist.toString());
        }

    }

}

