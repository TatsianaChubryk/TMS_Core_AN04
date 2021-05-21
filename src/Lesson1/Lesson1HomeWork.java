package Lesson1;

public class Lesson1HomeWork {
    public static void main(String[] args) {

        int a = 11;
        boolean isGreaterThanZero = a >= 0;
        System.out.println("Число a больше 0: " + isGreaterThanZero);
        a = Math.abs(a);
        String aStr = Integer.toString(a);
        int alength = aStr.length();
        System.out.println(alength);

    // а) Считаем все цифры в числе (дробную часть тоже)
        double b = 5.55;
        boolean isPrime = b % 1 != 0;
        System.out.println("Число дробное: " + isPrime);
        String bStr = Double.toString(b);
        int blength = bStr.length();
        System.out.println(blength - 1);

    // б) (посложнее) - считаем только цифры целой части
        double c = 18.55;
        boolean isPrimeToo = c % 1 != 0;
        System.out.println("Число дробное: " + isPrimeToo);
        int d = (int) c;
        String dStr = Integer.toString(d);
        int dlength = dStr.length();
        System.out.println(dlength);

    }
}
