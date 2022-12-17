package org.example;

/*
You are given an array of integers that represents the IDs of the users that have registered in “UpgradBook.”

The array of integers have the following properties:

The array is sorted is an ascending order

The array holds distinct integers (i.e. there are no repeating numbers)

The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])

However the length of the array, N, is unknown (i.e. you don’t know how long the array is and arrayName.length is not available to you). In short, you can not use the length of the array to apply binary search

Since the length of the array is unknown, an error “ArrayIndexOutOfBoundsException” is returned if you try to index into the array with an integer greater than N.

Find a function to find positive integer M in the array A and write a program to find M (if M exists) in O(log N) time.

If M exists, please print the index of M using System.out.println().

If M does not exist, please print the String "NOT_FOUND" using System.out.println().

 */


import java.util.Scanner;

public class SolutionB {

    private static int bookBinarySearch(int[] userIDs, int start, int end, int searchValue) {
        int mid = (start + end) / 2;

        try {
            if (end <= start) {
                return -1;
            } else if (userIDs[mid] == searchValue) {
                return mid;
            } else if (userIDs[mid] > searchValue) {
                return bookBinarySearch(userIDs, start, mid - 1, searchValue);
            } else {
                return bookBinarySearch(userIDs, mid + 1, end * end, searchValue);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return bookBinarySearch(userIDs, start, mid, searchValue);
        }

    }
    public static int search(int[] userIDs, int searchValue) {
        return bookBinarySearch(userIDs, 1, 2, searchValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int M = scanner.nextInt();
        if (size == 0) {
            System.out.print("NOT_FOUND");
            return;
        }
        int userIDs[] = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            userIDs[i] = scanner.nextInt();
        }

        int index = search(userIDs, M);
        System.out.println(index == -1 ? "NOT FOUND" : index);

    }
}