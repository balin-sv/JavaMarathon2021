package day12;

import java.util.ArrayList;

public class Task1 {

        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<>();

            list.add("Skoda");
            list.add("Mersedes");
            list.add("BMW");
            list.add("lADA");
            list.add("Niva");


            list.add(3, "Opel");


            list.remove(0);


            for (String string : list) {
                System.out.println(string);
            }

        }

}
