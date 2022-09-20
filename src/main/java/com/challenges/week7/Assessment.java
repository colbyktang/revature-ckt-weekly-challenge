package com.challenges.week7;

import java.util.Arrays;
import java.util.stream.Stream;

public class Assessment {

    private Assessment () {}
    
    public static int unchangedIndex (int N, int A[]) {
        int[] arr = A.clone();
        for (int i = 0; i < N; i++) {;
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == A[i]) {
                count++;
            }
        }

        return count;
    }

    public static int smallInteger (int N, int X, int A[]) {
        int result = A[0];
        for (int i = 0; i < N; i++) {
            if (A[i] < result && A[i] > X) {
                X = A[i];
            } 
        }
        return result;
    }

    public static int favorite (int L, int R, int N, int A[]) {
        return (int) Arrays.stream(A).filter(n -> n >= L && n <= R).count();
    }
}
