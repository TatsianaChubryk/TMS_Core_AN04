package Lesson3;
/*
Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
2.3) Найти максимальный элемент массива и поменять его местами с 1-м (0-м по индексу) числом массива
*/

import java.util.Random;
import java.util.Scanner;

public class Task2_3_Lesson3 {
    public static void main(String[] args) {
        //Не удалось поменять местами( Смогла только вместо первого поставить max
        Scanner numberN = new Scanner(System.in);
        System.out.print("Введите длину массива n: ");
        int n = numberN.nextInt();
        int[] randMath = new int[n];
        int max = 0;
        for (int i = 0; i < n; ++i) {
            randMath[i] = new Random().nextInt(33) - 15;
            System.out.print(randMath[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < randMath.length; i++){
            if (randMath[i] > max){
                max = randMath[i];
                int temp = randMath[0];
                randMath[0] = max;
                max = temp;
            }
       }
        System.out.println("Измененный массив");
        for (int i = 0; i < n; i++) {
            System.out.print(randMath[i] + " ");
        }
    }


}

