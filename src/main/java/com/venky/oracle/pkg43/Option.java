package com.venky.oracle.pkg43;

import java.util.Optional;

public class Option {
    public static void main(String[] args) {
        System.out.println("Ans : " + convert("a").get());
    }

    private static Optional<Integer> convert(String s) {
        try {
            return Optional.of(Integer.parseInt(s));

        } catch (Exception e) {

            return Optional.empty();

        }

    }

}

//Exception in thread "main" java.util.NoSuchElementException: No value present  === ANSWER