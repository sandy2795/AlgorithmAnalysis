package org.example;

import java.util.Scanner;

class RunTime_2 {
    public static boolean palindrome(int[] num, int index) {
        //write the logic here
        String a="",b="";
       // boolean result;
        for(int i=0;i<num.length;i++){
            a+=num[i];
        }
      //  System.out.println("length of array N is :"+num.length + "\n a->"+a);
        for(int j=num.length-1;j>=0;j--){
            b+=num[j];
        }
       // System.out.println(" b->"+b.toString());
        if(a.equals(b)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer =palindrome(num, 0);
        System.out.println(answer);
    }
}
