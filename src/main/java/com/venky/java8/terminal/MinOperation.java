package com.venky.java8.terminal;

import java.util.Optional;
import java.util.stream.Stream;

/*
Stream min() Example

min() method returns the minimum element of this stream according to the provided Comparator.
This does first sorting and takes the first element from the sorted array.

Syntax:
Optional<T> min(Comparator<? super T> comparator)


 */
public class MinOperation {
    public static void main(String[] args) {
        Stream<Integer> streamMin = Stream.of(1, 2, 3, 4, 5).parallel();
        Optional<Integer> min = streamMin.min((v1, v2) -> v1.compareTo(v2));
        System.out.println("Min value : " + min.get());
    }
}
