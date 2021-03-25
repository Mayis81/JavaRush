package com.javarush.task.pro.task04.task04018;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        boolean x = console.nextBoolean();
        int opt = (int)Math.ceil(glass);
        int pes = (int)Math.floor(glass);
        if (x)
        {
            System.out.println((int)Math.ceil(opt));
        }
        else
        {
            System.out.println((int)Math.floor(pes));
        }
    }
}
