package com.venky.oracle.pkg3;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

        Comparator c = new Comparator <String>() {

            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
    }
}
/*
OPTION   B
 */
