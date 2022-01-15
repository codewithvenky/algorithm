package com.venky.java8.defaultmethods;

import java.util.ArrayList;
import java.util.List;
interface  Moveable {
default void move(){
        System.out.println("I am moving");
        }
        }
public class Animal implements Moveable{
    public static void main(String[] args){
        List<Animal> list = new ArrayList();
        list.add(new Animal());
        list.add(new Animal());
        list.add(new Animal());
        //Iterator code reduced to one line
        // Default method have been introduced  in Java8
        list.forEach((Moveable p) -> p.move());
    }
}