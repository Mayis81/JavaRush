package com.javarush.task.pro.task05.task0509;

/*
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        int j = 0;
        int i = 0;
            while (i < MULTIPLICATION_TABLE.length) {
                while (j < MULTIPLICATION_TABLE.length) {
                    MULTIPLICATION_TABLE[i][j] = (i+1)*(j+1);
                    System.out.print(MULTIPLICATION_TABLE[i][j]+" ");
                    j++;
                }
                System.out.println();
                i++;
                j=0;
            }
            i=0;
    }
}