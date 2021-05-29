package Lesson2;

import java.util.Scanner;

public class Task1_Lesson2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        int month = in.nextInt();
        switch (month) {
            case 1: {
                System.out.println("Январь");
                break;
            }
            case 2: {
                System.out.println("Февраль");
                break;
            }
            case 3: {
                System.out.println("Март");
                break;
            }
            case 4: {
                System.out.println("Апрель");
                break;
            }
            case 5: {
                System.out.println("Май");
                break;
            }
            case 6: {
                System.out.println("Июнь");
                break;
            }
            case 7: {
                System.out.println("Июль");
                break;
            }
            case 8: {
                System.out.println("Август");
                break;
            }
            case 9: {
                System.out.println("Сентябрь");
                break;
            }
            case 10: {
                System.out.println("Октябрь");
                break;
            }
            case 11: {
                System.out.println("Ноябрь");
                break;
            }
            case 12: {
                System.out.println("Декабрь");
                break;
            }
            default: {
                System.out.println("Неправильное число, должно быть от 1 до 12");
                break;
            }
        }

        //Второй способ реализации
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        int number = n.nextInt();
        String[] month1 = {" ", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        if(number > 0 && number < month1.length) {
            System.out.println(month1[number]);
        }else {
            System.out.println("Неправильное число, должно быть от 1 до 12");
        }


    }
}
