package com.venky.oracle3.pkg1;

public class EulerLambda {
    public static void main(String[] args) {
       EulerInterface myElueer =   null;
        myElueer= () -> 2.71828;
        System.out.println("Value of Euler = " + myElueer.getEulerValue ());
    }
}