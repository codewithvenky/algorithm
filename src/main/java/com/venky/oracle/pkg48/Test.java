package com.venky.oracle.pkg48;

import java.util.function.BiPredicate;

public class Test {
    //BiPredicate<Integer, Integer> test1 = (final Integer x, var y) -> (x.equals(y));
    BiPredicate<Integer, Integer> test2 = (var x, final var y) -> (x.equals(y)); // ANSWER3
    BiPredicate<Integer, Integer> test3 = (Integer x, final Integer y) -> (x.equals(y)); //ANSWER
  //  BiPredicate<Integer, Integer> test4 = (Integer x, final var y) -> (x.equals(y));
    //BiPredicate<Integer, Integer> test5 = (final var x, y) -> (x.equals(y));

}