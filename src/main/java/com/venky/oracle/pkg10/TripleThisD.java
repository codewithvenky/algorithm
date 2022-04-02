package com.venky.oracle.pkg10;

import java.util.function.Function;

public class TripleThisD {
    public static void main(String[] args) {

        Function tripler = x->{return (Integer)x*3;};
        TripleThisD.printValue(tripler,4);
    }

    private static <T>  void printValue(Function <T,T> f, T num) {
        System.out.println(f.apply(num));
    }
}
// Remove one  This could be potential correct answer.
//Unchecked call to 'apply(T)' as a member of raw type 'java.util.function.Function'