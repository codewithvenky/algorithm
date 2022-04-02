package com.venky.oracle.pkg35;

public class Test {
    public static void main(String[] args) {
        int i = 10;
        do {
            for (int j = i / 2; j > 0; j--) {
                System.out.print(j + " ");
            }
            i-=2;
        }
         while (i>0) ;

        }
    }
//options b
/// 5,4,3,2,1
///4,3,2,1
///3,2,1
//2,1
//1
