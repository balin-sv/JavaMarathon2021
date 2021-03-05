/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.util.Locale;
import java.util.Scanner;

import static GAME.FieldService.checkCoordinatesForNumbers;
import static GAME.FieldService.fieldArray;
import static GAME.GameField.findCoordinates;

/**
 *
 * @author sv
 */
public class Main {

    public static void main(String[] args) throws NumberFormatException, Exception {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        GameField gameField1 = new GameField();
        GameField gameField2 = new GameField();

        System.out.println("/////////////расстановка коораблей - ИГРОК 1");

        gameField1.installShips();

        System.out.println("/////////////расстановка коораблей - ИГРОК 2");
        gameField2.installShips();

        System.out.println("ИГРОК 1");
        gameField1.showField();
        System.out.println("ИГРОК 2");
        gameField2.showField();
        System.out.println("/////////////начало игры");
        battle(gameField1, gameField2);
        System.out.println("ИГРОК 1");
        gameField1.showField();
        System.out.println("ИГРОК 2");
        gameField2.showField();

    }

    public static void battle(GameField gameField1, GameField gameField2) throws Exception {
        java.util.Random random = new java.util.Random();
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String coordinateLine;
        String[] arrayLine = new String[0];
        Integer[] arrayCoordinates = new Integer[0];

        int switcher = 0;
        int counter = 0;
        boolean check = false;

        do {

            if (counter == 0) {
                switcher = random.nextInt(2) + 1;

            }

            if (switcher == 3) {
                break;
            }

            System.out.println("ходит ИГРОК " + switcher);

            do {

                if (switcher == 1) {
                    gameField2.showCoordinates();
                } else {
                    gameField1.showCoordinates();
                }

                System.out.println("ИГРОК " + switcher + " введите координаты - 2 числа");

                coordinateLine = sc.next();

                arrayLine = coordinateLine.split(",");

                if (arrayLine.length == 2) {
                    arrayCoordinates = fieldArray(arrayLine);
                } else {
                    System.out.println("ошибка ввода - требуется ввести 2 числа");
                }
                check = arrayCoordinates != null;

                if (check == true) {
                    check = checkCoordinatesForNumbers(arrayCoordinates);
                } else {
                    System.out.println("ИГРОК " + switcher + " введи координаты верно(x,y)!");
                }

                if (check != true) {
                    System.out.println("ошибка ввода - число/а меньше 0 или больше 9");

                }

            } while (check != true);

            if (switcher == 1) {

                switcher = findCoordinates(arrayCoordinates[0], arrayCoordinates[1], gameField2, switcher);
            }

            if (switcher == 2) {

                switcher = findCoordinates(arrayCoordinates[0], arrayCoordinates[1], gameField1, switcher);
            }

            counter++;

        } while (!gameField2.listOfShipsForBattle.isEmpty() || !gameField1.listOfShipsForBattle.isEmpty());

    }

}

