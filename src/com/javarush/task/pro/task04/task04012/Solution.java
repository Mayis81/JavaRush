package com.javarush.task.pro.task04.task04012;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1; x <= 17; x++)
        {

            if (!(x % 3 == 0)) continue;
            {
                sum+=x;
            }
        }
        System.out.println(sum);
    }
}
