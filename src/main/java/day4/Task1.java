package day4;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count=0;
        int count1=0;
        double accum = 0;

////С клавиатуры вводится число n - размер массива.

        System.out.println("Укажите размер массива");
        int n = sc.nextInt();
//Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.

        double array1 [] = new double [n];

        for (int i = 0; i < n; i++) {
            array1[i] = Math.random()*10;
        }

//Bывести содержимое массива в консоль

        for (int i = 0; i < n; i++) {
            System.out.println("["+ array1[i]+"]");
        }

// вывести в консоль информацию о:

        System.out.println("Информация о массиве");

////а) Длине массива

        System.out.println(array1.length);
////б) Количестве чисел больше 8

        for (int i = 0; i < n; i++) {
            if (array1[i]> 8 ) {
                count++;
            }
        }
        System.out.println("Количествo чисел больше 8: " + count);

////в) Количестве чисел равных 1
        for (int i = 0; i < n; i++) {
            if (array1[i]== 8 ) {
                count++;
            }
        }
        System.out.println("Количествo чисел равных 1: " + count);

//г) Количестве четных чисел
////д) Количестве нечетных чисел

        for (int i = 0; i < n; i++) {
            if (array1[i]%2 == 0 ) {
                count++;
            } else {
                count1 ++;
            }
        }
        System.out.println("Количествo четных чисел: " + count);
        System.out.println("Количествo нечетных чисел: " + count1);

////е) Сумме всех элементов массива

        for (int i = 0; i < n; i++) {
            accum = accum + array1[i];
        }
        System.out.println("Сумма всех элементов массива: " + accum);

////Пример:
////Введено число 10. Сгенерирован следующий массив:
////Информация о массиве:
////Длина массива: 10
////Количество чисел больше 8: 1
////Количество чисел равных 1: 0
////Количество четных чисел: 6
////Количество нечетных чисел: 4
////Сумма всех элементов массива: 46


    }
}
