package org.example;

import java.util.Scanner;
public class Fibonacci {

    public int fibonacci(int n) {
        int a = 0, b = 1, c = n;
        for (int i=2; i<=n; i++){
            c = (a + b);
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {

        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(n));

    }

}