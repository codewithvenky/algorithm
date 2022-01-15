package com.venky.java8.builtinfunctional;

import java.util.function.Predicate;

public class PredicateInterfaceExample02 {
    static Boolean checkAge(int age){
        if(age>17)
            return true;
        else return false;
    }
    public static void main(String[] args){
        // Using Predicate interface
        Predicate<Integer> predicate =  PredicateInterfaceExample02::checkAge;
        // Calling Predicate method
        boolean result = predicate.test(25);
        System.out.println(result);
    }
}