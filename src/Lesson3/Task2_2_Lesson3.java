package Lesson3;

/*
Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
2.2) Найти второй по максимальности элемент массива (т.е. из чисел 1 2 3 4 - 3 будет вторым по максимальности)
*/

import java.util.Random;
import java.util.Scanner;

public class Task2_2_Lesson3 {
    public static void main(String[] args) {
        //Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
        Scanner numberN = new Scanner(System.in);
        System.out.print("Введите длину массива n: ");
        int n = numberN.nextInt();
        int[] randMath = new int[n];
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < n; ++i) {
            randMath[i] = new Random().nextInt(33) - 15;
            System.out.print(randMath[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < randMath.length; i++) {
            if (randMath[i] > max){
                max = randMath[i];
            }
            for (int j = 0; j < randMath.length; j++) {
                if (randMath[j] > max2 && randMath[j] < max) {
                    max2 = randMath[j];
                }
            }
        }
        System.out.println("Наибольший элемент: " + max);
        System.out.println("Второй наибольший элемент: " + max2);
    }
}
