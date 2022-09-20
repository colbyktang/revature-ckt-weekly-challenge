package com.challenges.week7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.challenges.week7.InsertionSort;

public class Week7Tests {
    
    @Test
    void insertionSortTest () {
        int n = 5;
        List<Integer> arr = Arrays.asList(2,4,6,8,3);
        InsertionSort.insertionSort(n, arr);
    }

    @Test
    void insertionSortTest2 () {
        int n = 2;
        List<Integer> arr = Arrays.asList(5, 4);
        InsertionSort.insertionSort(n, arr);
    }

    @Test
    void assessmentQ1 () {
        int n = 5;
        int[] arr = new int[] {5,2,3,1,4};
        System.out.println(Assessment.unchangedIndex(n, arr));
    }

    @Test
    void assessmentQ2 () {
        int n = 6;
        int x = 6;
        int[] arr = new int[] {7,5,4,2,1,8};
        System.out.println(Assessment.smallInteger(n, x, arr));
    }

    @Test
    void assessmentQ3 () {
        int L = 20;
        int R = 72;
        int N = 4;
        int[] arr = new int[] {61, 20, 72, 53};
        System.out.println(Assessment.favorite(L, R, N, arr));
    }
}
