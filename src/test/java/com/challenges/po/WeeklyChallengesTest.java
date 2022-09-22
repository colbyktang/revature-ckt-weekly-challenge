package com.challenges.po;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WeeklyChallengesTest {

    @Test
    public void challengeTest() {
        System.out.println("Find largest gap in array results: ");
        Integer[] arr1 = {3, 10, 6, 7};
        int result1 = WeeklyChallenge.FindLargestGapInArray(arr1);
        System.out.println("{3, 10, 6, 7}: " + result1);
        System.out.println("Expected Output: 7");
        
        Integer[] arr2 = {-3, -1, 6, 7, 0};
        int result2 = WeeklyChallenge.FindLargestGapInArray(arr2);
        System.out.println("{-3, -1, 6, 7, 0}: " + result2);
        System.out.println("Expected Output: 10");

        System.out.println("Maximum Sum SubArray using Divide and Conquer: ");
        int[] maxArr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        result1 = WeeklyChallenge.FindMaxSumArray(maxArr1);
        System.out.println("{-2, 1, -3, 4, -1, 2, 1, -5, 4}: " + result1);
        System.out.println("Expected Output: 6");

        int[] maxArr2 = {2, 2, -2};
        result2 = WeeklyChallenge.FindMaxSumArray(maxArr2);
        System.out.println("{2, 2, -2}: " + result2);
        System.out.println("Expected Output: 4");

        String testString = "Hello World";
        String reversedString = WeeklyChallenge.reverseString(testString);
        System.out.println(reversedString);
    }

    /*
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
    @Test
    void SecondMaximumNumber () {
        int[][] arr = {{1,2,3},{10,15,5},{100,999,500}};
        WeeklyChallenge_0922.secondMaximumNumber(3, arr);
    }

    /**
        Example
        Input:
        1
        ab1231da
        Output:
        7
     */
    @Test
    void printSumOfDigits () {
        String[] stringInputs = {"ab1231da"};
        WeeklyChallenge_0922.printSumOfDigits(1, stringInputs);
    }
}
