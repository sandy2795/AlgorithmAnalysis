package org.example;

import java.util.*;

public class Graded4_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print("last:"+lastNonZeroDigit(n));
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        // Write your code here
        int fat = 1;
        for(int i = 1;i<=n;i++){
            fat *= i;
        }
        System.out.println(fat);
        while(fat %10 == 0) {
            fat = fat / 10;
        }
        return  fat%10;
    }
}
