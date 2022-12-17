package org.example;
//Write a Java program to calculate the sum of the digits of a given number using recursion.

import java.util.Scanner;

class RunTime_1{
    public static int sum(int n) {
        //write the logic here
        if(n == 0) {
            return 0;
        }
        return n % 10 + sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
