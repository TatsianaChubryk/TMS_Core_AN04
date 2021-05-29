package Lesson3;
/*
Дан произвольный массив чисел
1.2) Найти среднее арифметическое элементов с нечетными номерами.
*/

public class Task1_2_Lesson3 {
    public static void main(String[] args) {
        int[] intArray = { 1, 8, 3, 10, 6, 4, 9, 10, 5 };
        double sum = 0;
        double average = 0;
        int lengthAverage = 0;
        for (int i = 0; i < intArray.length; i+=2){
            if ( intArray.length % 2 != 0) {
                sum += intArray[i];
                lengthAverage++;
                average = sum / lengthAverage;
            }
        }
        System.out.println("Среднее арифметическое элементов с нечетными номерами = " + average);
    }
}
