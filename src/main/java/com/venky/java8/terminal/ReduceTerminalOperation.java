package com.venky.java8.terminal;

import java.util.Optional;
import java.util.stream.Stream;

/*
Wherever we need to perform the one operation multiple times and finally it produces one result such as min,
max, avg, sum. In these scenarios reduce() method is very useful.


Syntax:

Optional<T> reduce(BinaryOperator<T> accumulator)

 */
public class ReduceTerminalOperation {
    public static void main(String[] args) {
        Stream<Integer> streamReduce = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> sum = streamReduce.reduce((value1, value2) -> value1 + value2);
        System.out.println("sum of first 5 numbers using reduce opration : " + sum.get());
    }
}
