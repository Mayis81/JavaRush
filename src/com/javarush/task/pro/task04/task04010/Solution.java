package com.javarush.task.pro.task04.task04010;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int nextmin = Integer.MAX_VALUE;
        while (x.hasNextInt()){
            int y = x.nextInt();
                if (y < min){
                    int temp = min;
                    min = y;
                    nextmin = temp;
                }
                if (min<y&&y<nextmin){
                    nextmin = y;
                }
            }
        System.out.println(nextmin);
    }
}
