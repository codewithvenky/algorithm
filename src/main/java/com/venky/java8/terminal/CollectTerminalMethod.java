package com.venky.java8.terminal;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTerminalMethod {
    public static void main(String[] args) {
        Stream<Integer> streamCOllect = Stream.of(1, 2, 2,3,3, 4, 5);
       /* List<Integer> intList = streamCOllect.collect(Collectors.toList());
        System.out.println(intList);*/
      /*  Set<Integer> intSet = streamCOllect.collect(Collectors.toSet());
        System.out.println(intSet);*/
        Long count = streamCOllect.collect(Collectors.counting());
        System.out.println(count);
    }
}
