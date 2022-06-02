package com.venky.java8.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccuraceOfEachCharacterInTheGivenStringUsingJava8 {

    public static void main(String[] args) {

        String str  ="ThisIsTheGivenStrinIWantToCounOcceranceOfEachCharacterUSingJava8";

        Map<Character, Long> collect = str.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(character -> character,Collectors.counting()));

        //    Map<Character, Long> collect = str.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


    }
}
