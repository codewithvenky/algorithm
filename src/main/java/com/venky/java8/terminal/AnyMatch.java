package com.venky.java8.terminal;

import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 Stream anyMatch() Example

This method checks the predicate condition.
If any value in the stream matches to the given predicate then it returns true else false.

Predicate is a functional interface that holds the condition.

Predicate p = value -> value > 0;
Syntax:
boolean anyMatch(Predicate<? super T> predicate)
 */
public class AnyMatch {
    public static void main(String[] args) {
        // Stream anymatch() Method Example
        Stream<Integer> streamAnymatch = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> anymatch = value -> value > 100;
        boolean isAnymatch = streamAnymatch.anyMatch(anymatch);
        System.out.println("anymatch value : " + isAnymatch);
    }
}
