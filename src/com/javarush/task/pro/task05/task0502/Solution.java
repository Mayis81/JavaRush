package com.javarush.task.pro.task05.task0502;

/*
Четные и нечетные ячейки массива
*/

public class Solution {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[20];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < strings.length; i++) {

            if (!(i % 2 == 0)) {
                strings[i] = ODD;
            } else {
                strings[i] = EVEN;
            }
            System.out.print("index = " + i);
            System.out.println(" value = " + strings[i]);
        }
    }
}