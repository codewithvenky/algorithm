package com.venky.oracle5.pkg4;

public class Main {
    static String prefix = "Mondial:";
    private String name = "domainmodel";
    public static String getName() {
        return new Main().name;
    }
    public static void main(String[] args) {
        Main m = new Main();
     //   System.out.println( prefix +getName());
        System.out.println( new Main().prefix + new Main().name);
    }
}

/*
Answer:

prefix +getName

 and
new Main().prefix + new Main().name


Main.prefix + Main.getName()

 */

