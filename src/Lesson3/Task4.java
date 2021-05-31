package Lesson3;

import java.util.Random;

/*
Реализовать сортировку пузырьком, в которой мы выталкиваем сначала элемент слева-направо,
а затем на обратном пути справа-налево и т.д.
 */
//public class Task4 {
 //   public static void main(String[] args) {
 //       int n = 5;
 //       int[] arrayRandom = new int[n];
 //       for (int k = 0; k < n; ++k) {
 //           arrayRandom[k] = new Random().nextInt(20);
 //           // System.out.println(arrayRandom[k]);
 //       }
 //       for (int rightBorder = arrayRandom.length - 1; rightBorder >= 0; rightBorder--) {
 //           for (int i = 0; i < rightBorder; ++i) {
 //               int left = arrayRandom[i];
 //               int right = arrayRandom[i + 1];
 //               if(left > right) {
 //                   arrayRandom[i + 1] = left;
 //                   arrayRandom[i] = right;
 //                   for (int leftBorder = 0; leftBorder <= arrayRandom.length - 1; leftBorder++) {
 //                       for (int j = arrayRandom.length; j > leftBorder; ++j) {
 //                           int left1 = arrayRandom[i];
 //                           int right1 = arrayRandom[i + 1];
 //                           if(left1 < right1) {
 //                               arrayRandom[i + 1] = left1;
 //                               arrayRandom[i] = right1;
 //               }
 //           }
 //       }
 //       } System.out.println(arrayRandom[i]);
 //       }
 //       }
 //   }
// }


