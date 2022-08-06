package com.venky.oracle4.pkg4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<String> list1 = new ArrayList<>(
                List.of("tPlane", "Automobile", "Motorcycle"));
        List<String> list2 = new ArrayList<>(List.copyOf(list1));
        list1.sort((String item1, String item2) -> item1.compareTo(item2));
        list2.sort((String itemi, String item2) -> itemi.compareTo(item2));
        System.out.println(list1.equals(list2));
    }
}