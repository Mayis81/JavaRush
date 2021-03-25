package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;
import java.util.Arrays;

/*
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int[] a = new int[scanner.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
    }