package Lesson2;
    /*Начав тренировки, спортсмен в первый день пробежал 10 км.
    Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
    Какой суммарный путь пробежит спортсмен за 7 дней?*/

public class Task3_3_Lesson2 {
    public static void main(String[] args) {
        double dayDistance = 10; //ежедневное увеличение
        double finishDistance = 10; //пробежал за первый день
        for (int i = 1; i < 7; i++){
            dayDistance = dayDistance * 1.1;
            finishDistance += dayDistance;
        }
        System.out.println(finishDistance);
    }
}