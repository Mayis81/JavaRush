package com.javarush.task.pro.task05.task0504;

import java.util.Arrays;

/*
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        int x = firstArray.length;
        int y = secondArray.length;
        int z = x + y;
        resultArray = new int[z];
        for (int i = 0, j = 0; i < resultArray.length; i++) {
            if (i < firstArray.length) {
                resultArray[i] = firstArray[i];
            } else if (j < secondArray.length) {
                resultArray[i] = secondArray[j];
                j++;
            }
            System.out.println(resultArray[i]);
       }
    }
}