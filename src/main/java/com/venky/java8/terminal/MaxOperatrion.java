package com.venky.java8.terminal;

import java.util.Optional;
import java.util.stream.Stream;

/*
Stream max() Example

This method returns the maximum element of this stream according to the provided Comparator.
This internally does sorting first and get the last element from it.
 If the stream is having large data set then better not to use this.

 Syntax:
Optional<T> max(Comparator<? super T> comparator)
 */
public class MaxOperatrion {
    public static void main(String[] args) {
        Stream<Integer> streamMax = Stream.of(1, 2, 3, 4, 5).parallel();
        Optional<Integer> max = streamMax.max((v1, v2) -> v1.compareTo(v2));
        System.out.println("Max value : " + max.get());
    }
}
