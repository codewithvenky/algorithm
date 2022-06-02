package com.venky.java8.terminal;

import java.util.function.Predicate;
import java.util.stream.Stream;

/*
This takes a predicate as an argument. If all of the stream elements do not match the predicate condition then it returns true else false.

Syntax:
boolean noneMatch(Predicate<? super T> predicate)
 */
public class NoneMatch {
    public static void main(String[] args) {
        // Stream noneMatch() Method Example
        Stream<Integer> streamNoneMatch = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> nonematch = value -> value > 2;
        boolean isNoneMatch = streamNoneMatch.noneMatch(nonematch);
        System.out.println("noneMatch method returned value : " + isNoneMatch);
    }
}
