package org.example;
//Generate All Passwords

import java.util.Scanner;

class Demo1
{
    static void genPW(char[] arr, int n)
    {
        //Write code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.println(arr[i] + ""+arr[j]);
            }
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n);
    }
}