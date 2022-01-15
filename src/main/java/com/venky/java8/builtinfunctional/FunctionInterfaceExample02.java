package com.venky.java8.builtinfunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample02 {
    static Integer addList(List<Integer> list){
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        // Creating a list and adding values
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Referring addList() method
        Function<List<Integer>, Integer> fun = FunctionInterfaceExample02::addList;
        // Calling Function interface method
        int result = fun.apply(list);
        System.out.println("Sum of list values: "+result);
    }
}