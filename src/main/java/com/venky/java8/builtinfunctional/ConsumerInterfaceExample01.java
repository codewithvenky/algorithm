package com.venky.java8.builtinfunctional;

import java.util.function.Consumer;

public class ConsumerInterfaceExample01 {
    static void printMessage(String name){
        System.out.println("Hello "+name);
    }
    static void printValue(int val){
        System.out.println(val);
    }
    public static void main(String[] args) {
        // Referring method to String type Consumer interface
        Consumer<String> consumer1 = ConsumerInterfaceExample01::printMessage;
        consumer1.accept("John");   // Calling Consumer method
        // Referring method to Integer type Consumer interface
        Consumer<Integer> consumer2 = ConsumerInterfaceExample01::printValue;
        consumer2.accept(12);   // Calling Consumer method
    }
}