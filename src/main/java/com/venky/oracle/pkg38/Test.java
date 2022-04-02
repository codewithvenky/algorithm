package com.venky.oracle.pkg38;

import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        var fruits = List.of("apple", "orange", "banana", "lemon");
        for(int i =0; i <100; i++) {
            Optional<String> result = fruits.stream().filter(f -> f.contains("n")).findAny();
            System.out.println(result.orElse("No fruit found"));
        }
    }
}


// Output:Option B code witll produce the same output  allways.