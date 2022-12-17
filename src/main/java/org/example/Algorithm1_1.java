package org.example;

//Recursion

import java.util.Scanner;
class Algorithm1_1{
    public static int sum(int n){
        //write the logic here
        int res = 0;
        for(int i=1;i<=n;i++){
            res = res +i;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            int value = Algorithm1_1.sum(n);
            System.out.print(value);
        }
        else{
            System.out.println("Enter a natural number");
        }
    }
}
