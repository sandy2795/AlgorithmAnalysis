package org.example;

//Power of a number using recursion.
import java.util.Scanner;
//import java.math.*;

public class Algorithm1_2 {
    // function to calculate base^exponent
    public static int powerfunc(int base, int power) {
        //write your code here
        if (power == 0) {
            return 1;
        } else {
            int  sum =1;
            for (int i = 1; i <= power; i++) {
                sum *=  base ;
            }
            return sum;
            //return base*power;
            // return Math.pow(base,power);
        }
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        // printing the value of a^b i.e.,
        //System.out.printf("%d", powerfunc(a, b));
        System.out.print(powerfunc(a, b));
    }

}

