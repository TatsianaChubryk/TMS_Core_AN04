package Lesson2;
    /*Дано число x, найти все простые числа от 1 до x
    (число считается простым, если делится только на себя и на 1)*/

import java.util.Scanner;

public class Task5_2_Lesson2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int numberX = in.nextInt();
        boolean b = true;
        for (int i = 1; i <= numberX; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(i);
            else b = true;
        }
    }
}


