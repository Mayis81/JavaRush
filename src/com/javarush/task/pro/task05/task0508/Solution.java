package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;
    public static String[] a;
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        a = new String[4];
        strings = new String[4];


        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            boolean isNull = false;

            for (int j = i+1; j < strings.length; j++) {
                if (strings[i] != null) {
                    if (strings[i].equals(strings[j])){
                        strings[j] = null;
                        isNull = true;
                    }
                }
                }

                if (isNull){
                    strings[i]=null;
                }
            System.out.println(strings[i]);
        }
        //System.out.print("i - "+strings[i]+"  ");


    }
}


// Arrays.stream(strings).forEach(System.out::println);

