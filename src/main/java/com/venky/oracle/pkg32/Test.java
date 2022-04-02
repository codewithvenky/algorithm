package com.venky.oracle.pkg32;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar bi = new Bar();
        List< String > li = new ArrayList< >();
        f2.foo(li);// prints Hello world!
        bi.foo(li);//  Hola Mundo
        f1.foo(li);//Bonjour le monde!


    }
}
