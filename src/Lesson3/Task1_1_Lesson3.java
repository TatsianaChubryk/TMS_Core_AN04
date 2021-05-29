package Lesson3;
/*
Дан произвольный массив чисел
1.1) Найти произведение элементов, кратных 3.
 */

public class Task1_1_Lesson3 {
    public static void main(String[] args) {
        int[] intArray = {1, 8, 3, 10, 6, 4, 9, 10, 5};
        int n = 1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 3 == 0) {
                n *= intArray[i];
            }
        }
        System.out.println("Произведение элементов, кратных 3 = " + n);
    }
}
