package com.venky.java8.builtinfunctional;
import java.util.function.BiConsumer;
public class BiConsumerInterfaceExample01 {
    static void ShowDetails(String name, Integer age){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        // Referring method
        BiConsumer<String, Integer> biCon = BiConsumerInterfaceExample01::ShowDetails;
        biCon.accept("Rama", 20);
        biCon.accept("Shyam", 25);
        // Using lambda expression
        BiConsumer<String, Integer> biCon2 = (name, age)->System.out.println(name+" "+age);
        biCon2.accept("Peter", 28);
    }
}