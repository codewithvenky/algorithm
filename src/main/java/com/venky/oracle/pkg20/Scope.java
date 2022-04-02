package com.venky.oracle.pkg20;
/*
class Scope I static int myint 666; public static void main(String[] args) { System.out.println(myint);

 */
public class Scope {
    static int myint =666;
    public static void main(String[] args) {
//int myint=myint;
        System.out.println(myint);

    }
}

/*
 Output
Compilation failse at line no 9

 */
