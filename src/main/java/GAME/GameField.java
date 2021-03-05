/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.util.*;

import static GAME.FieldService.*;

/**
 *
 * @author sv
 */
public class GameField {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    protected final String[][] gameArray = new String[10][10];
    protected List<Ships> listOfShipsForInstall = new ArrayList<>();
    protected List<Ships> listOfShipsForBattle = new ArrayList<>();

    public GameField() {

        listOfShipsForInstall.add(new Ships("[1a]"));
        listOfShipsForInstall.add(new Ships("[1b]"));
        listOfShipsForInstall.add(new Ships("[1c]"));
        listOfShipsForInstall.add(new Ships("[1d]"));
        listOfShipsForInstall.add(new Ships("[2a]"));
        listOfShipsForInstall.add(new Ships("[2b]"));
        listOfShipsForInstall.add(new Ships("[2c]"));
        listOfShipsForInstall.add(new Ships("[3a]"));
        listOfShipsForInstall.add(new Ships("[3b]"));
        listOfShipsForInstall.add(new Ships("[4a]"));

        for (int i = 0; i < gameArray.length; i++) {
            for (int j = 0; j < gameArray.length; j++) {
                gameArray[i][j] = "[" + "  ]";// [ +   ] - пустая клетка на поле

            }
        }

//        for (int i = 0; i < gameArray.length; i++) {
//            for (int j = 0; j < gameArray.length; j++) {
//                System.out.print(gameArray[i][j]);
//            }
//            System.out.println("");
//        }
    }

    public void installShips() throws NullPointerException, Exception {;
        Integer[] coordinates = new Integer[0];
        boolean check = false;

        while (listOfShipsForInstall.size() != 6) {

            System.out.println("координаты для 1 палубных кораблей - 2 числа");
            String lineXY;

            lineXY = sc.nextLine();

            String[] auxLine = lineXY.split(",");

            if (auxLine.length == 2) {
                coordinates = fieldArray(auxLine);
            } else {
                System.out.println("ошибка ввода - требуется ввести 2 числа");

            }

            check = coordinates != null;

            if (check == true) {
                check = checkCoordinatesForNumbers(coordinates);
            }

            if (check == true) {
                check = checkCoordinatesForSequence(coordinates);

            } else {
                if (coordinates != null) {
                    System.out.println("ошибка ввода - число/а меньше 0 или больше 9");
                }

            }

            if (check == true) {
                checkField(coordinates, listOfShipsForBattle, listOfShipsForInstall);
            }

        }

        while (listOfShipsForInstall.size() != 3) {
            System.out.println("координаты для 2 палубных кораблей - 4 числа");
            String lineXY = sc.nextLine();
            String[] auxLine = lineXY.split("[,;]+");
            if (auxLine.length == 4) {

                coordinates = fieldArray(auxLine);
            } else {
                System.out.println("ошибка ввода - требуется ввести 4 числа");
            }

            check = coordinates != null;

            if (check == true) {
                check = checkCoordinatesForNumbers(coordinates);
            }

            if (check == true) {
                check = checkCoordinatesForSequence(coordinates);
            }

            if (check == true) {
                checkField(coordinates, listOfShipsForBattle, listOfShipsForInstall);
            }

        }

        while (listOfShipsForInstall.size() != 1) {
            System.out.println("координаты для 3 палубных кораблей - 6 чисел");
            String lineXY = sc.nextLine();
            String[] auxLine = lineXY.split("[,;]+");
            if (auxLine.length == 6) {

                coordinates = fieldArray(auxLine);
            } else {
                System.out.println("ошибка ввода - требуется ввести 6 чисел");
            }
            check = coordinates != null;

            if (check == true) {
                check = checkCoordinatesForNumbers(coordinates);
            }

            if (check == true) {
                check = checkCoordinatesForSequence(coordinates);

            } else {
                if (coordinates != null) {
                    System.out.println("ошибка ввода - число/а меньше 0 или больше 9");
                }

            }

            if (check == true) {
                checkField(coordinates, listOfShipsForBattle, listOfShipsForInstall);
            }

        }

        while (!listOfShipsForInstall.isEmpty()) {
            System.out.println("координаты для 4 палубного корабля - 8 чисел");
            String lineXY = sc.nextLine();
            String[] auxLine = lineXY.split("[,;]+");
            if (auxLine.length == 8) {

                coordinates = fieldArray(auxLine);
            } else {
                System.out.println("ошибка ввода - требуется ввести 8 чисел");
            }

            check = coordinates != null;

            if (check == true) {
                check = checkCoordinatesForNumbers(coordinates);
            }

            if (check == true) {
                check = checkCoordinatesForSequence(coordinates);
            } else {
                if (coordinates != null) {
                    System.out.println("ошибка ввода - число/а меньше 0 или больше 9");
                }
            }

            if (check == true) {
                checkField(coordinates, listOfShipsForBattle, listOfShipsForInstall);
            }
        }
    }

    public void checkField(Integer[] coordinates, List<Ships> listOfShipsForBattle, List<Ships> listOfShipsForInstall) {
        int caunter = 0;
        for (int i = 0; i < coordinates.length; i = i + 2) {
            if (!gameArray[coordinates[i]][coordinates[i + 1]].equals("[" + "  ]")) {
                caunter++;
                System.out.println("координаты заняты - корабль не установлен");
                break;
            }
        }

        if (caunter == 0) {
            for (int i = 0; i < coordinates.length; i = i + 2) {
                gameArray[coordinates[i]][coordinates[i + 1]] = listOfShipsForInstall.get(0).getType();
            }

            listOfShipsForInstall.get(0).setShipCoordinate(coordinates);

            listOfShipsForBattle.add(listOfShipsForInstall.get(0));

            listOfShipsForInstall.remove(0);

            System.out.println("корабль установлен");

        }

    }

    //
// проверка только для 1 палубного
//    public void installHalo(int[]coordinates) {
//
//        if (coordinates[0] >= 1 && coordinates[1] <= 8) {
//            for (int i = coordinates[0] - 1; i < coordinates[0] + 2; i++) {
//                for (int j = coordinates[1] - 1; j < coordinates[1] + 2; j++) {
//                    if (gameArray[i][j].equals("[" + " ]") || gameArray[i][j].equals("[#]")) {
//                        gameArray[i][j] = "[#]";
//                    }
//                }
//            }
//        } else if (coordinates[0] >= 1 && coordinates[0] <= 8
//                && coordinates[1] == 0) {
//            for (int i = coordinates[0] - 1; i < coordinates[0] + 2; i++) {
//                for (int j = coordinates[1]; j < coordinates[1] + 2; j++) {
//                    if (gameArray[i][j].equals("[" + " ]") || gameArray[i][j].equals("[#]")) {
//                        gameArray[i][j] = "[#]";
//                    }
//                }
//            }
//
//        } else if (coordinates[0] >= 1 && coordinates[0] <= 8
//                && coordinates[1] == 9) {
//            for (int i = coordinates[0] - 1; i < coordinates[0] + 2; i++) {
//                for (int j = coordinates[1] - 1; j < coordinates[1]; j++) {
//                    if (gameArray[i][j].equals("[" + " ]") || gameArray[i][j].equals("[#]")) {
//                        gameArray[i][j] = "[#]";
//                    }
//                }
//            }
//        }
//    }
    public void showField() {
        for (int i = 0; i < gameArray.length; i++) {
            for (int j = 0; j < gameArray.length; j++) {
                System.out.print(gameArray[i][j]);
            }
            System.out.println("");
        }

    }

    public void showCoordinates() {
        for (int i = 0; i < listOfShipsForBattle.size(); i++) {

            if (i == 5) {
                System.out.println("");
            }
            System.out.print("type=" + listOfShipsForBattle.get(i).getType());
            listOfShipsForBattle.get(i).getShipCoordinate();

        }
        System.out.println("");
    }

    public static int findCoordinates(int a, int b, GameField field, int switcher) {
        boolean shipCondition = false;

        if (field.gameArray[a][b].equals("[" + "  ]") || field.gameArray[a][b].equals("[**]")) {
            System.out.println("мимо! теперь ходит другой игрок");

            switch (switcher) {
                case 1:
                    switcher = 2;
                    break;
                case 2:
                    switcher = 1;
                    break;
            }

        } else {
            System.out.println("корабль подбит!");
//изменение двух значений массива соответствующего корабля на -1 / метка подбитого корабля
            for (Ships ship : field.listOfShipsForBattle) {
                if (ship.getType().equals(field.gameArray[a][b])) {
// вызываю метод в классе Ships
                    shipCondition = ship.changeOnePartOfShip(a, b);
                }

            }
        }

        if (shipCondition == true) {

            Iterator<Ships> iterator = field.listOfShipsForBattle.iterator();
            while (iterator.hasNext()) {
                Ships nextShips = iterator.next();
                if (nextShips.getType().equals(field.gameArray[a][b])) {
                    iterator.remove();
                    System.out.println("корабль утоплен!");
                    break;
                }
            }

        }

// меняю значение коррдинат на поле на [**]
        field.gameArray[a][b] = "[**]";

        if (field.listOfShipsForBattle.isEmpty()) {
            if (switcher == 1) {
                System.out.println("ПОБЕДИЛ ИГРОК 1");
            } else {
                System.out.println("ПОБЕДИЛ ИГРОК 2 ");
            }
            switcher = 3; //игра закончена
        }
        return switcher;

    }
}

