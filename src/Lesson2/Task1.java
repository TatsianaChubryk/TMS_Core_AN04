package Lesson2;
import java.util.Scanner;

/*  Написать программу, которая читает введеное с консоли число. Число должно быть от 1 до 12.
    Напечатать на консоль название месяца, которое соответствует введеному числу (например 1 - Январь)
    Если число неправильное (не от 1 до 12),напечатать на консоль сообщение, информирующее об ошибке
    (например "Неправильное число, должно быть от 1 до 12)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        int num = in.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("Месяц - Январь");
                    break;
                }
                case 2: {
                    System.out.println("Месяц - Февраль");
                    break;
                }
                case 3: {
                    System.out.println("Месяц - Март");
                    break;
                }
                case 4: {
                    System.out.println("Месяц - Апрель");
                    break;
                }
                case 5: {
                    System.out.println("Месяц - Май");
                    break;
                }
                case 6: {
                    System.out.println("Месяц - Июнь");
                    break;
                }
                case 7: {
                    System.out.println("Месяц - Июль");
                    break;
                }
                case 8: {
                    System.out.println("Месяц - Август");
                    break;
                }
                case 9: {
                    System.out.println("Месяц - Сентябрь");
                    break;
                }
                case 10: {
                    System.out.println("Месяц - Октябрь");
                    break;
                }
                case 11: {
                    System.out.println("Месяц - Ноябрь");
                    break;
                }
                case 12: {
                    System.out.println("Месяц - Декабрь");
                    break;
                }
                default: {
                    System.out.println("Введенное число не находится в диапазоне от 1 до 12");
                }
            }
        in.close();
    }
}
