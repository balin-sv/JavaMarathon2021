/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

/**
 *
 * @author sv
 */
public class Ships {

    protected String type;
    protected Integer[] shipCoordinate;

    public Ships(String type, Integer[] shipCoordinate, int n) {
        this.type = type;
        this.shipCoordinate = shipCoordinate;

    }

    public Ships(String type, Integer[] shipCoordinate) {
        this.type = type;
        this.shipCoordinate = shipCoordinate;
    }

    public Ships() {
    }

    public Ships(String type) {
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void getShipCoordinate() {
        for (int i : shipCoordinate) {
            System.out.print("/" + i + "/");
        }
        System.out.print(" ");
    }

    public void setShipCoordinate(Integer[] shipCoordinate) {
        this.shipCoordinate = shipCoordinate;
    }

    @Override
    public String toString() {
        return "Ships{" + "type=" + type + '}';
    }
    //метод последовательно находит пару координат переданных в параметрах,
    //меняет найденные числа в массиве на [-1][-1] /метка подбитого корабля/
    public boolean changeOnePartOfShip(int a, int b) {
        boolean wrecked = true;

        for (int i = 0; i < this.shipCoordinate.length; i = i + 2) {
            if (shipCoordinate[i] == a && shipCoordinate[i + 1] == b) {
                shipCoordinate[i] = -1;
                shipCoordinate[i + 1] = -1;
            }
        }

//проверяет утоплен корабль или подбит /по метке -1 /
        for (int coordinate : this.shipCoordinate) {
            if (coordinate != -1) {
                wrecked = false;
                System.out.println("корабль подбит");
                break;
            }
        }

        return wrecked;

    }

}
