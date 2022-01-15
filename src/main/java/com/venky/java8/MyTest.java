package com.venky.java8;

import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        int a[] = new int[100];
        for(int i =0; i<99; i++)
        {
            if (i %3==0)
                a[i]=1;
        }
        System.out.println(Arrays.toString(a));
        long acutalCoput =Arrays.stream(a).filter(value -> value==1).count();
        System.out.println(a.length);
        System.out.println(acutalCoput);
    }
}
