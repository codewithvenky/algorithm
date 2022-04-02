package com.venky.oracle.pkg6;

interface AbilityA {
    default void action() {
        System.out.println("a action");
    }
}
interface AbilityB {
     void action();
}
public class Test implements AbilityA, AbilityB {
    public static void main (String[] args) {
          AbilityA x = new Test();
          x.action();
    }
    public void action() {
        System.out.println("ab action");
    }
}

/*
Output:
ab action
 */