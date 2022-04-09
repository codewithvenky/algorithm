package com.venky.oracle.pkg42;

public class Test42 {
    private final int x = 1;
   //static final int y;

    public Test42() {
        System.out.print(x);
       //  System.out.print(y);
    }

    public static void main(String args[]) {
        new Test42();
    }
}

//Compilation error at line no. 10
//its  confustion not exactly answer mentioned in question