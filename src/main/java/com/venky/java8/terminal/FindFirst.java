package com.venky.java8.terminal;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
This method get the first value always from stream.
 The value is returned as an instance of Optional. If the stream is empty them returns empty Optional object.
 */
public class FindFirst {
    public static void main(String[] args) {
        Stream<Integer> streamFindFirst = Stream.of(1,4, 2, 3, 4, 5).parallel();
        Predicate<Integer> findFirst = value -> value % 2 == 0;
        Optional<Integer> findFirstOpt = streamFindFirst.filter(findFirst).findFirst();
        System.out.println("Find first odd number : " + findFirstOpt.get());
    }
}
