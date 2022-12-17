package org.example;
//Print the given pattern using recursion.

import java.lang.String;
import java.util.Scanner;

public class Algorithm1_3{
    // function to print the required pattern
    public static String func(int n) {
        //write your code here
        int i, j;
        for(i=0; i<n; i++)
        {
            for (j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
        return " ";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }

}
