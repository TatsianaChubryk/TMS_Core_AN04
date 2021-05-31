package Lesson3;

import java.util.Random;

/*
Одномерные массивы посложнее
3.1) В произвольно заполненном массиве проверить все ли числа разные
 */
public class Task3 {
    public static void main(String[] args) {
        int n = 25;
        int duplicates = 0;
        int[] arrayRandom = new int[n];
            for (int i = 0; i < n; ++i) {
            arrayRandom[i] = new Random().nextInt(20);
            System.out.println(arrayRandom[i]);
        }
        for (int j = 0; j < arrayRandom.length; j++) {
            for (int k = j + 1; k < arrayRandom.length; k++) {
                if (arrayRandom[j] == arrayRandom[k]) {
                    duplicates++;
                }
            }
        }
        System.out.println("Количество совпадений " + duplicates);
    }
}

