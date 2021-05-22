package Lesson1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /**
         * Даны 2 числа.
         * Вывести большее из них.
         * Подсказка: используйте Math.abs(..) для нахождения модуля числа
         **/

        // Друго решение мне найти не удалось(
        Scanner numberA = new Scanner(System.in);
        System.out.println("Введит значение числа a:");
        int a = numberA.nextInt();
        Scanner numberB = new Scanner(System.in);
        System.out.println("Введит значение числа b:");
        int b = numberB.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);
        System.out.println("Большее число из 2 чисел: " + Math.max(absA,absB));

    }
}
