package com.venky.output.ticky;

public class P0001 {

    public static void main(String[] args) {
        Integer num01=100;
        Integer num02 =100;
        Integer num03=500;
        Integer num04 =500;
        if(num01==num02)
        {
            System.out.println("100");
        }else {
            System.out.println("!100");
        }

        if(num03==num04)
        {
            System.out.println("500");
        }else {
            System.out.println("!500");
        }
    }
}

/*
100
!500"
nteger is an Object and need to use equals to compare.
Direct == is comparing the reference whether pointing the same object,
 when you define an Integer between -128 to 127 in Java,
 instead of creating a new object it returns an object already created.




 */
