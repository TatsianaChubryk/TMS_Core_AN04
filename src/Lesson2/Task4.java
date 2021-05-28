package Lesson2;
import java.util.Scanner;

/*
Дано положительное число x (например 1098).
Написать программу, которая печатает на консоль все цифры данного числа
(используя цикл while)
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое положительное число: ");
        int num = in.nextInt();
        int i = 0;
        while (i < num) {
            i++;
            System.out.println(i);
        }
    }
}
