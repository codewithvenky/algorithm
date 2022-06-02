package com.venky.java8.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*

This method works similarly to the forEach() but
it executes the order they appear in the stream. This ignores the parallel() method invocation.
Syntax:


void forEachOrdered(Consumer<? super T> action)
 */
public class ForEachOrdered {
    public static void main(String[] args) {
        // Stream streamForEachOrdered() Method Example
        Stream<Integer> streamForEachOrdered = Stream.of(1, 2, 3, 4, 5).parallel();
// Printing the values
        streamForEachOrdered.forEachOrdered(value -> System.out.println(value));

// Adding values to list.
        Stream<Integer> streamForEachOrderedList = Stream.of(1, 2, 3, 4, 5).parallel();
        List<Integer> numList1 = new ArrayList<>();
        streamForEachOrderedList.forEachOrdered(value -> numList1.add(value));
        System.out.println("numList1 : " + numList1);
    }
}
