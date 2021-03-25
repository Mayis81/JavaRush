package com.javarush.task.pro.task04.task04015;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();
        double pi = 3.14;
        if (radius>0) {
            System.out.println((int) (pi * radius * radius));
        }
    }
}
