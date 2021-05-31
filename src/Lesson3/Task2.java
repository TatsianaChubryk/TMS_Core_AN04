package Lesson3;

import java.util.Random;
    /*
    Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
    Найти наименьший нечетный элемент
     */
public class Task2 {
    public static void main(String[] args) {
        int n = 5;
        int minNum = 17;
        int[] arrayRandom = new int[n];
        for (int i = 0; i < n; ++i) {
            arrayRandom[i] =new Random().nextInt(33) - 15;
            System.out.println(arrayRandom[i]);
            if (minNum > arrayRandom[i]) {
                minNum = arrayRandom[i];
            }
        }
        System.out.println("Минимальное значение в массиве " + minNum);
    }
}
