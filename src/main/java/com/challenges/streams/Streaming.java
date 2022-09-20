package com.challenges.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streaming {

    public static void Test () {
        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
        nameStream.forEach(System.out::println);

        // CANNOT OPERATE UPON ALREADY USED STREAMS

        List<String> stringList = Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());

        System.out.println(stringList);
        int k = 5;
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        int money = bill.stream().filter(e -> e != k).reduce(0, Integer::sum);
    }
}