package com.venky.oracle.pkg32;

import java.util.Collection;
import java.util.List;

public class Bar extends Foo
{
    public void foo(Collection arg) {
        System.out.println("Hello world!");
    }


    public void foo(List arg) {
        System.out.println("Hola Mundo!");

    }
}