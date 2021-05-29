package Lesson3;

/*
Дана квадртная матрица NxN
5.1) Найти максимум на главное диагонали
*/

import java.util.Random;

public class Task5_1_Lesson3 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] randMatrix = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                randMatrix[i][j] = new Random().nextInt(10); //заполняла от 0 до 9, чтоб матрица была красивой
                System.out.print(randMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < randMatrix.length; ++i) {
            for (int j = 0; j < randMatrix[i].length; ++j) {
                if (i == j && randMatrix[i][j] > max) { //надеюсь так можно делать
                    max = randMatrix[i][j];
                }
            }
        }
        System.out.println("Максимальное значение на главной диагонали " + max);
    }
}

