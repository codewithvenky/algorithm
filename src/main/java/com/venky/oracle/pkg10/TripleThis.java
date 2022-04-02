package com.venky.oracle.pkg10;

import java.util.function.Function;
/* Baase problem
*/
public class TripleThis {
    public static void main(String[] args) {

        Function  tripler = x->{return (Integer)x*3;};
        TripleThis.printValue(tripler,4);
    }

    private static <T>  void printValue(Function f, T num) {
        System.out.println(f.apply(num));
    }
}

/*
Option D an A

 */