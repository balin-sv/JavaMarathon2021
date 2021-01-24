package day4;

public class Task4 {
    public static void main(String[] args) {

//Создать новый массив размера 100 и заполнить его случайными числами из
//диапазона от 0 до 10000. Найти максимум среди сумм трех соседних элементов.
//Для найденной тройки с максимальной суммой выведите значение суммы и индекс
//первого элемента тройки.

        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }

        int index = 0;
        int max = array[0] + array[1] + array[2];
        for (int i = 0; i < array.length - 2; i++) {
            if ((array[i] + array[i + 1] + array[i + 2]) > max) {
                max = (array[i] + array[i + 1] + array[i + 2]);
                index = i;
            }
        }
        System.out.println("");
        System.out.println("Тройка с максимальной суммой: [" + array[index] + "]"
                + "[" + array[index + 1] + "]" + "[" + array[index + 2] + "]");
        System.out.println("Cумма тройки: " + max);
        System.out.println("Индекс первого элемента тройки: " + index);

    }
}
