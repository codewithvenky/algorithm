package com.venky.java8.test;

import java.util.Arrays;
import java.util.stream.Stream;
 /*
 Merge Two Array Using Java 8

  */
public class MergeTwoArrayUsingJava8 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};

        Object[] objects = Stream.of(arr1, arr2).flatMap(ints -> Arrays.stream(ints)).toArray();
        System.out.println(Arrays.deepToString(objects));

        Object[] objects1 = Stream.of(Arrays.asList(arr1), Arrays.asList(arr2)).flatMap(ints -> ints.stream()).toArray();
        System.out.println(objects1);


    }

}