package Lesson3;

/*
Дан произвольный массив чисел
1.3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.
 */

import java.util.Scanner;

public class Task1_3_Lesson3 {
    public static void main(String[] args) {
        int[] intArray = { 2, 8, 3, 10, 11 };
        Scanner numberС = new Scanner(System.in);
        System.out.print("Введите число С: ");
        int c = numberС.nextInt();
        double sum = 0;
        double average = 0;
        int lengthAverage = 0;
        for (int i = 0; i < intArray.length; i++){
            if (c < intArray[i]) {
                System.out.println(intArray[i]);
                sum += intArray[i];
                lengthAverage++;
                average = sum / lengthAverage;
            }
        }
        System.out.println("Среднее арифметическое чисел, больших 'c' = " + average);
    }
}
