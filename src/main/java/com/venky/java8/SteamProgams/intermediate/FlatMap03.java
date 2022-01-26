package com.venky.java8.SteamProgams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMap03 {

    public static void main(String[] args)
    {

        // Creating a List of Strings
        List<String> list = Arrays.asList("venky", "SAHIL",
                "codewithvenky", "ridhhi");

        // Using Stream flatMapToInt(Function mapper)
        // to get length of all strings present in list
        IntStream intStream = list.stream().flatMapToInt(str -> IntStream.of(str.length()));
        intStream.forEach(System.out::println);
    }
}
