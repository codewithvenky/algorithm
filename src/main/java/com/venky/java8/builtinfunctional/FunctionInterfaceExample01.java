package com.venky.java8.builtinfunctional;

import java.util.function.Function;

public class FunctionInterfaceExample01 {
    static String show(String message){
        return "Hello "+message;
    }
    public static void main(String[] args) {
        // Function interface referring to a method
        Function<String, String> fun = FunctionInterfaceExample01::show;
        // Calling Function interface method
        System.out.println(fun.apply("Peter"));
    }
}