package org.example;

public class Graded2_1 {
    public static void main(String args[]){
        func(3,3);
    }

    public static int func(int x, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0) {
            System.out.println(func(x * x, n / 2));
            return 1;
        }
        else{
            System.out.println( x * func(x * x, n / 2));
            return 1;
        }
    }
}