package com.venky.java8.test;

import java.util.Arrays;
import java.util.stream.Collectors;
/*
Find All the distinct character in a String using java 8
 */
public class FindAllDistinctCharacterFromTheStringUsingJava8
{

    public static void main(String[] args) {
        String str ="HelloWord";
        str.codePoints().mapToObj(c->(char)c).distinct().forEach(System.out:: print);
        System.out.println();
        str.chars().mapToObj(c->(char)c).distinct().forEach(System.out::print);
        System.out.println();
        Arrays.stream(str.split("")).distinct().forEach(System.out ::print);

        System.out.println();
        String collect = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        System.out.println(collect);


    }
}
