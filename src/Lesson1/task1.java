package Lesson1;

public class task1 {
    public static void main(String[] args) {

        /**
         * В переменную записываем число.
         * Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
         * Например, "это однозначное положительное число".
         * Добавить решение для дробных чисел.
         **/

        System.out.println("Решение для 0");
        int number = 0;
        System.out.println("Число, записанное в переменную: " + number);
        boolean isGreaterThanZero = number >= 0;
        System.out.println("Ваше число > 0?: " + isGreaterThanZero);
        number = Math.abs(number);
        String aStr = Integer.toString(number);
        int length = aStr.length();
        System.out.println("Количество цифр в числе: " + length);
        System.out.println(" "); //добавила эту строку для того, чтобы решения былы наглядно оформлены


        System.out.println("Решение для отрицательного числа");
        int number1 = -58964165;
        System.out.println("Число, записанное в переменную: " + number1);
        boolean isGreaterThanZero1 = number1 >= 0;
        System.out.println("Ваше число > 0?: " + isGreaterThanZero1);
        number1 = Math.abs(number1);
        String aStr1 = Integer.toString(number1);
        int length1 = aStr1.length();
        System.out.println("Количество цифр в числе: " + length1);
        System.out.println(" "); //добавила эту строку для того, чтобы решения былы наглядно оформлены

        System.out.println("Решение для дробного числа");
        double number2 = 28466.588;
        System.out.println("Число, записанное в переменную: " + number2);
        boolean isGreaterThanZero2 = number2 >= 0;
        System.out.println("Ваше число > 0?: " + isGreaterThanZero2);
        double num = (double)Math.log10(number2)+1;
        System.out.println("Количество цифр в целой части числа: " + (int) num);

    }
}
