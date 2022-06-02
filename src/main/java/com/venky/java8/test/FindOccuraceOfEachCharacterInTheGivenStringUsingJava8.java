package com.venky.java8.test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuraceOfEachCharacterInTheGivenStringUsingJava8 {

    public static void main(String[] args) {

        String str  ="ThisIsTheGivenStrinIWantToCounOcceranceOfEachCharacterUSingJava8";

        Map<Character, Long> collect = str.codePoints().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);

        Map<Character, Long> collect02 = str.codePoints().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect02);


    }
}
