package Lesson2;
/*
5.1) Написать программу, которая печатает на консоль прямоугольник из символа "@" длины NxM
(задается вручную, т.е. int n = 10; int m = 5, например)
 */
public class Task5 {
    public static void main(String[] args) {

        int n = 10;
        int m = 5;

        for (int i = 0; i < n; i++) {
            for (int j =0; j < m; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
