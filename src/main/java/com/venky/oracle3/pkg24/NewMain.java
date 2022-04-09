package com.venky.oracle3.pkg24;

import java.util.ArrayList;
import java.util.Arrays;

public class NewMain {public static void main(String[] args) {
    String[] catNames= { "abyssinian", "oxicat","korat", "laperm", "bengal", "sphynx" };
    var cats = new ArrayList<>(Arrays.asList(catNames));
    cats.sort((var a, var b) -> -a.compareTo(b));
    cats.forEach(System.out::println);
}
}