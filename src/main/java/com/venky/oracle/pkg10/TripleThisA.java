package com.venky.oracle.pkg10;

import java.util.function.Function;

public class TripleThisA {
    public static void main(String[] args) {

        Function<Integer,Integer > tripler = x->{return x*3;};
        TripleThisA.printValue(tripler,4);
    }

    private static <T>  void printValue(Function f, T num) {
        System.out.println(f.apply(num));
    }
}