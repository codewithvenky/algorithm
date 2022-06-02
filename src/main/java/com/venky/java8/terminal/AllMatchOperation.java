package com.venky.java8.terminal;

import java.util.function.Predicate;
import java.util.stream.Stream;

/*
This method also takes a predicate as an argument. Predicate holds a condition.
If all values of stream match to the given predicate then it returns true else false.


Syntax:
boolean allMatch(Predicate<? super T> predicate)
 */
public class AllMatchOperation {
    public static void main(String[] args) {
        // Stream allmatch() Method Example
        Stream<Integer> streamAllmatch = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> allmatch = value -> value > 2;
        boolean isAllmatch = streamAllmatch.allMatch(allmatch);
        System.out.println("allmatch value : " + isAllmatch);
    }
}
