package com.challenges.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RevatureAssessmentWeek3 {
    public static int question1 (int N) {
        return rearrangeTheDigits(N);
    }

    public static int rearrangeTheDigits(int N) {
        char[] charInt = String.valueOf(N).toCharArray();
        Arrays.sort(charInt);
        List<Character> chars = new ArrayList<Character>();
        for (char ch : charInt) {
            chars.add(ch);
        }
        String strResult = "";
        for (int i = chars.size() - 1; i >= 0; i--) {
            strResult += chars.get(i);
        }
        int result = Integer.parseInt(strResult);
        return result;
    }

    // Does not work properly
    public static int rearrangeTheDigitsStream(int N) {
        // Sort
        // Reverse
        int[] digits = Integer.toString(N).chars().map(c -> c-'0').toArray();
        int from = 0;
        int to = digits.length;
        String strResult = IntStream.range(from, to)
        .map(i -> digits[digits.length - 1 - i])
        .boxed()
        .map(i -> String.valueOf(i))
        .collect(Collectors.joining());
        return Integer.parseInt(strResult);
    }

    public static int question2(int L, int R, int N, int A[]) {
        return favorite (L, R, N, A);
    }
    
    public static int favorite(int L, int R, int N, int A[]) {
        int result = (int) Arrays.stream(A).filter(i -> i >= L || i <= R).count();
        return result;
    }

    public static void question3(int N, int A[]) {
        deleteDuplicate (N, A);
    }

    public static void deleteDuplicate(int N, int A[]) {
        //this is default OUTPUT. You can change it
        
        A = Arrays.stream(A).distinct().sorted().toArray();
        //For optimizing code, You are free to make changes to "return type", "variables" and "Libraries".
        System.out.println(A.length);
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
