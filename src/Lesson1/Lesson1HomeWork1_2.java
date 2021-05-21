package Lesson1;

public class Lesson1HomeWork1_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;

        boolean triangleExist = (a + b) > c && (a + c) > b && (b + c) > a;
        System.out.println("Треугольник существует " + triangleExist);
    }
   }
