package com.venky.oracle.pkg29;

public class Foo {
    public static String ALPHA = "alpha";
    protected String beta = "beta";
    private final String delta;

    public Foo(String d) {
        delta = ALPHA + d;
    }

    public String foo() {
        return beta += delta;
    }
}

////  C public static finfal String  alpha = "Alpha"