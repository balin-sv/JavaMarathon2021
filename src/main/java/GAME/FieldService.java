/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.util.Locale;
import java.util.Scanner;

public class FieldService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public static Integer[] fieldArray(String[] auxLine) throws Exception {
        Integer[] aux = new Integer[auxLine.length];

        for (int i = 0; i < auxLine.length; i++) {
            try {
                aux[i] = Integer.parseInt(auxLine[i]);
            } catch (NumberFormatException e) {
                System.out.println("ошибка ввода - требуется ввести число");
                aux = null;
                break;
            } catch (NullPointerException a) {
                System.out.println("ошибка ввода - требуется число");
                aux = null;
                break;
            }
        }

        return aux;

    }

    public static boolean checkCoordinatesForNumbers(Integer[] coordinates) {

        int counter = 0;

        for (int i = 0; i < coordinates.length; i++) {

            if (coordinates[i] >= 0 && coordinates[i] <= 9 && coordinates[i] instanceof Integer) {
                counter++;
            }

        }

        return counter == coordinates.length;

    }

    public static boolean checkCoordinatesForSequence(Integer[] coordinates) {

        int chekVertical = coordinates[0];
        int chekGorizontal = coordinates[1];
        boolean check = true;

        for (int i = 2; i < coordinates.length; i = i + 2) {
            if (coordinates[i + 1] - 1 == chekGorizontal && coordinates[i] == coordinates[0]) {
                chekGorizontal = coordinates[i + 1];

            } else if (coordinates[i] - 1 == chekVertical && coordinates[i + 1] == coordinates[1]) {
                chekVertical = coordinates[i]; //проверка вертикальных кораблей

            } else {
                System.out.println("ошибка ввода - неверная последовательнось");
                check = false;
                break;
            }
        }
        return check;

    }

}


