package org.example;
/*
You are given an array of integers that represents the IDs of the users that have registered in “UpgradBook,” a private social network created for all the students who have graduated from Upgrads’ programs.

The array of integers has the following properties:

With a known length N

The array is sorted in an ascending order

The array holds distinct integers (i.e. there are no repeating numbers)

The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])

Find the first positive integer M (where 1 <= M <= N) such that when M is used as the array index, the result from the array is the the integer M itself. i.e. A[M] = M

In other words, find the first positive integer M where M is both a user’s ID and its index in the array of user ids.

Write a program to find M, if it exists, in O(log N) time. If M does not exist, please return NOT_FOUND



Please note that the code takes two inputs:

First one being the size of the array

Second one being the elements inside the array

So, to input an array having 5 elements, the first input will be 5 and the next 5 inputs will be the elements of the array.

Test Cases
 */

import java.util.Scanner;

public class SolutionA {

    public static int upgradBookSearch(int[] userIDs) {
        int startIndex = 1;
        int endIndex = userIDs.length;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;

            if (middleIndex == userIDs[middleIndex]) {
                return middleIndex;
            }
            if (middleIndex < userIDs[middleIndex]) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            array[i] = scanner.nextInt();
        }

        int index = upgradBookSearch(array);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("NOT_FOUND");
        }
    }
}