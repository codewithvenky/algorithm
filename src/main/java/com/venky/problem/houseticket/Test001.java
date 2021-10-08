package com.venky.problem.houseticket;

import java.util.Arrays;

public class Test001 {
    public static void main(String[] args) {
        Integer arr[]= new Integer[9];
        arr[4]=5;
        boolean test   = Arrays.asList(arr)
                .contains(5);
        System.out.println(test);
    }
}
