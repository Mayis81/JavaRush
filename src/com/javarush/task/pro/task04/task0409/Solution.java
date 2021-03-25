package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/*
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner consol = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (consol.hasNextInt()){
            int x = consol.nextInt();
            if (x % 2 == 0){
                if (x < min){
                    min = x;
                }
            }
        }
        System.out.println(min);









    }
}