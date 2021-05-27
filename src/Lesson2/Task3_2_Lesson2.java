package Lesson2;
    /*Вычислить: 1+2+4+8+...+256*/

public class Task3_2_Lesson2 {
    public static void main(String[] args) {

        //первое решение
        int i = 1;
        int sum = 0;
        while (i <= 256){
            sum += i;
            i *= 2;
        }
        System.out.println(sum);

        //второе решение
        int sumj = 0;
        for (int j =1; j<=256; j *=2){
            sumj += j;
        }
        System.out.println(sumj);
    }
}
