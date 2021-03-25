package com.javarush.task.pro.test;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int[] array = new int[console.nextInt()];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = console.nextInt();
        }
        for (int i = array.length-1; i>=0; i--)
        {

            System.out.println(array[i]);
        }




    }
}
