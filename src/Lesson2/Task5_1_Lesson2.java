package Lesson2;
    /*Написать программу, которая печатает на консоль прямоугольник из символа "@" длины NxM
    (задается вручную, т.е. int n = 10; int m = 5, например)*/

import java.util.Scanner;

public class Task5_1_Lesson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();

        Scanner im = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = in.nextInt();

        if (n > 0 && m > 0){
            for (int i = 1; i <= m; i++){
                for (int j = 1; j < n; j++){
                    System.out.print("@");
                }
                System.out.println("@");
            }
        }else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
}
