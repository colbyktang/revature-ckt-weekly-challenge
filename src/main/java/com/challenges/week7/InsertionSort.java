package com.challenges.week7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class InsertionSort {
    public static void insertionSort(int n, List<Integer> arr) {
        Integer currentNumber = arr.get(n-1);
        for (int i = n - 1; i > 0; i--) {
            if (currentNumber > arr.get(i-1)) {
                arr.set(i, currentNumber);
                printArray (arr);
            } else {
                arr.set(i, arr.get(i-1));
                printArray (arr);
            }
        }
    }
    
    public static void printArray (List<Integer> arr) {
        arr.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
