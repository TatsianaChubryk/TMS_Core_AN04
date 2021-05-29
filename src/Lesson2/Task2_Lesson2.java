package Lesson2;
    /* Дано 2 числа, день и месяц рождения.
    Написать программу, которая определяет знак зодиака человека */

import java.util.Scanner;

public class Task2_Lesson2 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Введите день вашего рождения: ");
        int day = n.nextInt();
        Scanner m = new Scanner(System.in);
        System.out.print("Введите месяц вашего рождения: ");
        int month = m.nextInt();

        if (day >= 21 && day<=31  && month == 3 || day <= 19 && month == 4) {
            System.out.println("Овен");
        } else if (day >= 20 && day<=30 && month == 4 || day <= 20 && month == 5) {
            System.out.println("Телец");
        } else if (day >= 21 && day <= 31 && month == 5 || day <= 20 && month == 6) {
            System.out.println("Близнецы");
        } else if (day >= 21 && day <= 30 && month == 6 || day <= 22 && month == 7){
            System.out.println("Рак");
        } else if (day >= 23 && day <= 31 && month == 7 || day <= 22 && month == 8){
            System.out.println("Лев");
        } else if (day >= 23 && day <= 31 && month == 8 || day <= 22 && month == 9){
            System.out.println("Дева");
        } else if (day >= 23 && day <= 30 && month == 9 || day <= 22 && month == 10){
            System.out.println("Весы");
        } else if (day >= 23 && day <= 31 && month == 10 || day <= 21 && month == 11){
            System.out.println("Скорпион");
        } else if (day >= 22 && day <= 30 && month == 11 || day <= 21 && month == 12){
            System.out.println("Стрелец");
        } else if (day >= 22 && day <= 31 && month == 12 || day <= 19 && month == 1){
            System.out.println("Козерог");
        } else if (day >= 20 && day <= 31 && month == 1 || day <= 18 && month == 2){
            System.out.println("Водолей");
        } else if (day >= 19 && day <= 29 && month == 2 || day <= 20 && month == 3){
            System.out.println("Рыбы");
        }
        else{
            System.out.println("Нет подходящего знака зодиака");
        }
    }
}
