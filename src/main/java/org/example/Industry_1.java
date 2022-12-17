package org.example;

import java.util.*;

public class Industry_1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primesLessThanOrEqualTon(n);
    }

    // Method to print all primes less than or equal to n in ascending order
    static void primesLessThanOrEqualTon(int n) {
        // Write your code here
        String p="2 3 ", np="";
        if(n<=1){
            System.out.println("There are no prime numbers less than or equal to "+n);
            p = " ";
        }
        for(int i=4;i<=n;i++){
            if(n%i !=0 ){ //|| i ==n
                if(i %2 !=0 && i%3 !=0) {
                    p = p + i + " ";
                }else {
                    np = np + i + " ";
                }
            }else{
                np = np + i + " ";
            }
        }

       System.out.println("np:"+np);
        System.out.println(p);
    }
}
