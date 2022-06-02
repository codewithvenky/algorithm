package com.venky.concept;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test01 {

    public static void main(String[] args) {
        String word = "XXXCCCCYYYYAAABBB";
        Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
    }
}
