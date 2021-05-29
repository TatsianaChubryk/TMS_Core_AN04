package Lesson3;
/*
Дана квадртная матрица NxN
5.4) Транспонировать матрицу NxM
*/

import java.util.Random;

public class Task5_4_Lesson3 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] randMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                randMatrix[i][j] = new Random().nextInt(10); //заполняла от 0 до 9, чтоб матрица была красивой
                System.out.print(randMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = randMatrix[i][j];
                randMatrix[i][j] = randMatrix[j][i];
                randMatrix[j][i] = temp;
            }
        }
        System.out.println("Транспонированная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(randMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
