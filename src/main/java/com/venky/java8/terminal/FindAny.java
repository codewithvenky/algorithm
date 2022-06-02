package com.venky.java8.terminal;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*

This will be getting the value randomly from the stream. That's why the method is named findAny if any value present in the stream.
The value will be returned as an Optional object. If the stream is empty then it returns empty Optional object.
Optional<T> findAny()
 */
public class FindAny {
    public static void main(String[] args) {

        for (int i =0; i < 100; i++) {
            Stream<Integer> streamFindAny = Stream.of(1, 2,7,9, 3, 4, 5).parallel();
            Predicate<Integer> findAny = value -> value % 2 == 1;
            Optional<Integer> findAnyOpt = streamFindAny.filter(findAny).findAny();
            System.out.println("Find any odd number : " + findAnyOpt.get());
        }

    }
}
