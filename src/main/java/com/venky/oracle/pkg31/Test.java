package com.venky.oracle.pkg31;

public class Test{

        public static void main(String args[]) {
            Anotherclass ac = new Anotherclass();
            SomeClass sc = new Anotherclass();
          // ac=sc;
            sc.methodA();
            ac.methodA();
        }
}

class SomeClass {
    public void methodA() {
        System.out.println("SomeClass#methodA ()");
    }
}

class Anotherclass extends SomeClass {
    public void methodA() {
        System.out.println("Anotherclass #methodA ()");
        System.out.println("Anotherclass #methodA ()");
    }
}

/*
Compilation fails  at line no 8
 */