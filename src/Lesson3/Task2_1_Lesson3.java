package Lesson3;
/*
Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
2.1) Найти наименьший нечетный элемент.
*/

import java.util.Random;
import java.util.Scanner;

public class Task2_1_Lesson3 {
    public static void main(String[] args) {
        //Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
        Scanner numberN = new Scanner(System.in);
        System.out.print("Введите длину массива n: ");
        int n = numberN.nextInt();
        int[] randMath = new int[n];
        int min = 0;
        for (int i = 0; i < n; ++i) {
            randMath[i] = new Random().nextInt(33) - 15;
            System.out.print(randMath[i] + " ");
           }
        System.out.println();
        System.out.println("Нечетные элементы матрицы");
        for (int i = 0; i < randMath.length; i+=2){
            System.out.print(randMath[i] + " "); //вывожу для себя для удобства проверки
            if (randMath[i] < min){
                min = randMath[i];
            }
        }
        System.out.println();
        System.out.println("Наименьший нечетный элемент: " + min);
    }
}
