package com.challenges.po;

public class WeeklyChallenge_0926 {
    /*
     * Largest Gap (Java)

    Given an array of integers, return the largest gap between the sorted elements of the array.

    For example, consider the array:


    [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]


    ... in which, after sorting, the array becomes:


    [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]


    ... so that we now see that the largest gap in the array is between 9 and 20 which is 11.
     */
    public static int findLargestGap (int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int maxGap = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < n - 1; i++) {
            int gap = Math.abs(arr[i] - arr[i+1]);
            if (gap > maxGap) maxGap = gap;
        }
        return maxGap;
    }
}
