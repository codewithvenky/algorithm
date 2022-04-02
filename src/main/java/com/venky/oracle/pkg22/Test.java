package com.venky.oracle.pkg22;

/*
Given the code fragment:
var i = 10; var j = 5; і += (j + 5 + i) Ij - 2; System.out.println (i);
What is the result?
оооо
O A) 15 o B) 23 o C) 21 o D) 11 o E) 5
 */
public class Test {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
       i += (j * 5 + i)/j-2; // ITS SIMLY MEANS  I =I+ (EXPRESSION)

    System.out.println (i);
    }
}


/*
Option A is correct

 */
