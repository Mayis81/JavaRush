package com.javarush.task.pro.task04.task04017;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ms = console.nextInt();
        double kmch = ms * 3.6;
        System.out.println(Math.round(kmch));
    }
}
