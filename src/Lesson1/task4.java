package Lesson1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /**
         * Даны 3 целых числа.
         * Найти количество положительных чисел в исходном наборе.
         * Подсказка: используйте Math.abs(..) для нахождения модуля числа
         **/

        // Смогла придумать только такое решение используя то, что проходили на уроке и подсказки
        // но что-то внутри меня противится этому решению
        int a = 156;
        int b = -52;
        int c = 18;

        System.out.println("Число a: " + a);
        System.out.println("Число b: " + b);
        System.out.println("Число c: " + c);

        int resA = Math.abs(a) / Math.abs(a);
        int resB = Math.abs(b) - Math.abs(b);
        int resC = Math.abs(c) / Math.abs(c);

        int res = resA + resB + resC;
        System.out.println("Количество положительных чисел в исходном наборе: " + res);

        // Решила оставить свое первое решение
        /*Scanner numberA = new Scanner(System.in);
        System.out.println("Введите целое число a: ");
        int a = numberA.nextInt();
        Scanner numberB = new Scanner(System.in);
        System.out.println("Введите целое число b: ");
        int b = numberB.nextInt();
        Scanner numberC = new Scanner(System.in);
        System.out.println("Введите целое число c: ");
        int c = numberC.nextInt();

        int amount = (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0);
        System.out.println("количество положительных чисел: " + amount);*/
    }
}
