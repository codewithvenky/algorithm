package com.venky.oracle5.pkg3;

import java.util.function.Function;

public class Test {
    static int i = 6;
    public static void main(String[] args) {
        int i = 5;
        Function myAdder = x -> {
            return (Integer) x + i;
        };
        printValue(myAdder, 3);
        System.out.println(myAdder.apply(3));
    }
            public static void printValue(Function f, int num)
            {
                int i = 7;
                System.out.println(f.apply(num));
            }

}
