package org.example;
//Two people meet each other

import java.util.*;

public class Industry_2People {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int p1 = s.nextInt();
        int p2 = s.nextInt();
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        //twoPeopleMeet(p1, p2, s1, s2);
        test(4);
    }

    // Method to find whether two people meet after jumping for the same number of times
    static void twoPeopleMeet(int p1, int p2, int s1, int s2) {
        // Write your code here
        int max = Integer.MAX_VALUE;
        while (p1 < max && p2 < max) {
            if (p1 == p2) {
                System.out.println("YES");
                return;
            }
            p1 += s1;
            p2 += s2;
        }
        if(p1 != p2)
            System.out.println("NO");
    }

    static void test(int a){

        if (a % 2 == 1)
            System.out.println( a++);
        else {}
           // System.out.println(test(test(a - 1)));
    }
}
