package com.venky.oracle.pkg13;


public class BuilderImpl implements Builder {

    @Override
    public A build(String str) {
        return new B(str);
    }
}
