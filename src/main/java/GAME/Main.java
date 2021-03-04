/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.util.Locale;
import java.util.Scanner;

import static GAME.GameField.findCoordinates;

/**
 *
 * @author sv
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        GameField gameField1 = new GameField();
        GameField gameField2 = new GameField();

        System.out.println("/////////////расстановка коораблей");

        gameField1.installShips();
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

    public static void battle(GameField gameField1, GameField gameField2) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int coordinateA = 0;
        int coordinateB = 0;
        int switcher = 0;
        int counter = 0;

        do {

            if (counter == 0) {
                switcher = 1;
            }

            if (switcher == 3) {
                break;
            }

            System.out.println("введите 1 число");

            coordinateA = sc.nextInt();

            System.out.println("введите 2 число");
            coordinateB = sc.nextInt();

            if (switcher == 1) {

                switcher = findCoordinates(coordinateA, coordinateB, gameField2, switcher);
            }

            if (switcher == 2) {

                switcher = findCoordinates(coordinateA, coordinateB, gameField1, switcher);
            }

            counter++;

        } while (!gameField2.listOfShipsForBattle.isEmpty() || !gameField1.listOfShipsForBattle.isEmpty());

    }

}
