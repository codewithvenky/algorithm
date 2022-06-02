package com.venky.java8.test;

public class FindOccuraceOfAGivenCharacterInTheGivenStringUsingJava8 {

    public static void main(String[] args) {
        String str  ="ThisIsTheGivenStrinIWantToCounOcceranceOfEachCharacterUSingJava8";
        long count = str.chars().filter(e -> e == 'c').count();
        System.out.println(count);
    }



}
