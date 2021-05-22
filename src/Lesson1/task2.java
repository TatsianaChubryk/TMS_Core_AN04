package Lesson1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        /**
         * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
         * Определить существует ли такой треугольник.
         * Дано: a, b, c – стороны предполагаемого треугольника.
         * Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
         * Если хотя бы в одном случае отрезок окажется больше суммы двух других,
         * то треугольника с такими сторонами не существует.
         * Подсказка: используйте тип boolean и логические операции с ним:
         * || - логическое ИЛИ,
         * && - логическое И
         **/

        Scanner numberA = new Scanner(System.in);
        System.out.println("Введите значение длины стороны a: ");
        int a = numberA.nextInt();
        Scanner numberB = new Scanner(System.in);
        System.out.println("Введите значение длины стороны b: ");
        int b = numberB.nextInt();
        Scanner numberC = new Scanner(System.in);
        System.out.println("Введите значение длины стороны c: ");
        int c = numberC.nextInt();

        System.out.println("Длина стороны 'a': " + a);
        System.out.println("Длина стороны 'b': " + b);
        System.out.println("Длина стороны 'c': " + c);

        int ab = a+b;
        int bc = b+c;
        int ca = c+a;

        boolean isGreater = ab > c && bc > a && ca > b;
        System.out.println("Существует ли треугольник с такими сторонами? " + (ab > c && bc > a && ca > b));
        System.out.println(" ");

    }
}
