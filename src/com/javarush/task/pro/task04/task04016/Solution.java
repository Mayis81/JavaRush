package com.javarush.task.pro.task04.task04016;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        double z = x*1.0/y;
        System.out.println(z);
    }
}
