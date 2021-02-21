package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {

        File file = new File("test");
        printSumdigits(file);

    }

    public static void printSumdigits(File file) throws IOException {
        int aux = 0;
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
        }

        String line = sc.nextLine();

        sc.close();

        String numbersString[] = line.split(" ");

        if (numbersString.length<10) {
            try{
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }

        int[] numbers = new int[10];


        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            aux = aux + numbers[i];

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(aux);

    }

}

