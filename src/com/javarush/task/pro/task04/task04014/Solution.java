package com.javarush.task.pro.task04.task04014;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String x = console.nextLine();
        int y = console.nextInt();
        int z = 0;
        do {
            if (y<=0||y>=5) {
                System.out.println(x);
                break;
            }
            System.out.println(x);
            z++;
        }while (z<y);

    }
}
