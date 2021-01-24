package day4;

public class Task3 {
    public static void main(String[] args) {

//Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
//Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность
//по колонкам).
        int m = 12;
        int n = 8;

        int array[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
        }

        System.out.println("");
        System.out.println("Массив суммы строк");

        int array1[] = new int[m]; //массив для записи суммы каждой строки
        int aux; //вспомогательная переменная для передачи в метод номер нужной нам строки
        for (int i = 0; i < m; i++) {
            aux = i;
            array1[i] = LineSummary(array, aux, m, n);
        }

        for (int i = 0; i < m; i++) {
            System.out.print("[" + array1[i] + "]");
        }

        System.out.println("");

//В консоль вывести индекс строки, сумма чисел в которой
//максимальна. Если таких строк несколько, вывести индекс последней из них.
        int max = array1[0];
        int index = 0;
        for (int i = 0; i < m; i++) {
            if (array1[i] > max) {
                max = array1[i];
                index = i;

            }
        }

        System.out.println("Индекс строки с максимальной суммой: " + index + "  (" + max + ")");

    }

    static int LineSummary(int array[][], int aux, int m, int n) {
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == aux) {
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }

}
