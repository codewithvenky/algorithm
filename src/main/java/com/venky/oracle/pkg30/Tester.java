package com.venky.oracle.pkg30;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        try {
            doA();
            doB();
        } catch (IOException e) {
            System.out.print("c");
            return;

        } finally {
            System.out.print("d");
        }
        System.out.print("f"); // This stateMent Wiill naveer going to be executed
    }

    private static void doA() {
        System.out.print("a");
        if (false) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static void doB() throws FileNotFoundException {
        System.out.print("b");
        if (true) {
            throw new FileNotFoundException();
        }
    }
}


/*
abcd


 */

