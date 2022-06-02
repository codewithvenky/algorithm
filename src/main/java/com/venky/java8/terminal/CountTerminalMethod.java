package com.venky.java8.terminal;

import java.util.stream.Stream;

public class CountTerminalMethod {
    public static void main(String[] args) {
        // Stream count() Method Example
        Stream<Integer> streamCount = Stream.of(1, 2, 3, 4, 5);
        long count = streamCount.count();
        System.out.println("count :: " + count);
    }
}
