/*Implement a Java program to perform the following array operations: 
•	Find the maximum and minimum values in an array. 
•	Count the number of pairs in the array that have a given sum k. */


package com.citiustech;

import java.util.Scanner;

public class Assignment_1 {

    static int countPairs(int[] arr, int k, int n) {

        int counts = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == k) {
                    counts++;
                }
            }
        }

        return counts;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();

        System.out.println("Enter " + n + " elements of the array: ");

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the sum to find the pairs: ");
        int k = scan.nextInt();

        int count_res = countPairs(arr, k, n);

        System.out.println("Number of pairs: " + count_res);

        int maxx = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxx) {
                maxx = arr[i];
            }

            if (arr[i] < minn) {
                minn = arr[i];
            }
        }

        System.out.println("Max value: " + maxx);
        System.out.println("Minimum value: " + minn);

        scan.close();
    }
}