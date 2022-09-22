package com.challenges.po;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WeeklyChallenge {
    /**
     * Largest gap in an array:
     * Given an unsorted array of length N, and we have to find the largest gap between any two elements of the array. 
     * In simple words, find max(|Ai-Aj|) where 1 ≤ i ≤ N and 1 ≤ j ≤ N.
     * @author Colby Tang
     * @param arr
     * @return int
     */
    public static int FindLargestGapInArray (Integer[] arr) {
        if (arr.length == 0) return 0;
        int min = Stream.of(arr).min(Integer::compare).get();
        int max = Stream.of(arr).max(Integer::compare).get();
        return Math.abs(min - max);
    }

    /**
     * 
     * @param arr
     * @return int
     */
    public static int FindMaxSumArray (int[] arr) {
        // Check to see if arr is empty or null, if so return 0;
        if (arr == null || arr.length == 0) return 0;
        return FindMaxSumArray(arr, 0, arr.length - 1);
    }

    public static int FindMaxSumArray (int[] arr, int left, int right) {
        // Base Case
        if (left == right) return arr[0];

        // Find the mid index
        int mid = (left + right) / 2;

        // Left Subarray, mid inclusive
        int leftMax = arr[mid];
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            if (sum > leftMax) leftMax = sum;
        }

        // Right Subarray, mid exclusive
        int rightMax = arr[mid+1];
        sum = 0;    // reset sum to 0
        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            if (sum > rightMax) rightMax = sum;
        }

        // Choose 
        return Math.max(
            leftMax + rightMax,
            Integer.max(FindMaxSumArray(arr, left, mid), FindMaxSumArray(arr, mid + 1, right))
        );
    }

    public static String reverseString (String inputString) {
        String retString = "";
        char[] inputStringChar = inputString.toCharArray();

        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < inputStringChar.length; i++) {
            characterStack.push(inputStringChar[i]);
        }
        for (int i = 0; i < inputStringChar.length; i++) {
            retString += characterStack.pop();
        }

        return retString;
    }

    /**
     * Problem Statement
        Write a program that accepts sets of three numbers and prints the second-maximum number among the three.

        Input
        First line contains the number of triples, N.
        The next N lines which follow each have three space separated integers.

        Output
        For each of the N triples, output one new line which contains the second-maximum integer among the three.

        Constraints
        1 ≤ N ≤ 6
        1 ≤ every integer ≤ 10000
            
        The three integers in a single triplet are all distinct. That is, no two of them are equal.

        Sample Input
        3
        1 2 3
        10 15 5
        100 999 500
        Sample Output
        2
        10
        500
    */
    public static void secondMaximumNumber (int n, int[][] sets) {
        // for each set
        for (int[] set : sets) {
            // sort the array
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2 - i; j++) {
                    if (set[j] > set[j+1]) {
                        int temp = set[j];
                        set[j] = set[j+1];
                        set[j+1] = temp;
                    }
                }
            }

            System.out.println(set[1]);
        }

    }
    /*
        Problem statement
        Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

        Input
        The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
        Each test case is described with a single line containing a string S, the alphanumeric string.

        Output
        For each test case, output a single line containing the sum of all the digit characters in that string.

        Constraints
        1 ≤ T ≤ 1000
        1 ≤ |S| ≤ 1000, where |S| is the length of the string S.

        Example
        Input:
        1
        ab1231da
        Output:
        7
     */
    public static void printSumOfDigits (int n, String[] stringInputs) {
        for (String input : stringInputs) {
            int sum = 0;
            for (char ch : input.toCharArray()) {
                if (Character.isDigit(ch)) {
                    sum += Integer.parseInt(String.valueOf(ch));
                }
            }
            System.out.println(sum);
        }
    }
}