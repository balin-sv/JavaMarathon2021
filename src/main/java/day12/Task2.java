package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 32; i++) {

            list.add(i++);
        }

        Integer aux = 300;

        for (int i = 32; i < 52; i++) {

            if (i == 32) {
                list.add(aux);
            }
            aux = 300 + i++;

            list.add(aux);
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

    }

}
