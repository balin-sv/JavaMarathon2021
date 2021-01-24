package day4;

public class Task2 {
    public static void main(String[] args) {

//Создать новый массив размера 100 и заполнить его случайными числами из
//диапазона от 0 до 10000.

        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

//Затем, используя цикл for each вывести в консоль:
//наибольший элемент массива

        int max = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("наибольший элемент массива: " + max);

        //наименьший элемент массива
        int min = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println("наименьший элемент массива: " + min);

//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0

        int count = 0;
        int accum = 0;

        for (int i : array) {
            if (i % 10 == 0) {
                count++;
                accum = accum + i;
            }
        }

        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + accum);

//Использовать сортировку запрещено.
    }
}
