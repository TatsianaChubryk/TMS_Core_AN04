package Lesson3;
/*
Дан произвольный массив чисел
1.1) Найти произведение элементов, кратных 3.
 */
public class Task1 {
    public static void main(String[] args) {
        int [] intArray = {2, 5, 4, 6, 48, 5, 55, 2,};
        int b = 1;
        for (int i = 0; i < intArray.length; i++) {
           if (intArray[i] % 3 == 0) {
              b *= intArray[i];
           }
        }
        System.out.println(b);
    }
}
