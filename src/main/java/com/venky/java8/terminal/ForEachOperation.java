package com.venky.java8.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
This is very useful while debugging to print the values of the stream.
This is used to perform one action on each value of stream and finally returns nothing.

Syntax:

void forEach(Consumer<? super T> action)
This takes Consumer Functional Interface as an argument.
 */
public class ForEachOperation  {
    public static void main(String[] args) {
        // Stream forEach() Method Example
        Stream<Integer> streamForEach = Stream.of(1, 2, 3, 4, 5);
// Printing the values
        streamForEach.forEach(value -> System.out.println(value));

// Adding values to list.
        List<Integer> numList = new ArrayList<>();
        streamForEach.forEach(value -> numList.add(value));
        System.out.println("numList : " + numList);
    }
}
