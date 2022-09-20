package com.challenges.week5;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BillDivision {
        /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // bill: an array of integers representing the cost of each item ordered
        // k: an integer representing the zero-based index of the item Anna doesn't eat
        // b: the amount of money that Anna contributed to the bill
        
        bill.remove(k);
        int money = bill.stream().reduce(0, Integer::sum);
        int result = (int) (b - ((double)money / 2));
        if (result == 0) {
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(10);
        bonAppetit(bill, 1, 12);
    }
}