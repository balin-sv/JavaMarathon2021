package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {

        File file = new File("newfile1");

        System.out.println(parseFileToStringList(file));

    }

    /**
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static List<People> parseFileToStringList(File file) throws IOException {

        List <People> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                String [] aux = line.split(" ");


                if (Integer.parseInt(aux[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                People p = new People(aux[0],Integer.parseInt(aux[1]) );

                list.add(p);
            }

            return list;

        } catch (FileNotFoundException | IllegalArgumentException e) {

            System.out.println("");

        }
        return null;

    }
}








