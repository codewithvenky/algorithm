package com.venky.oralce2.pkg9;

public class Test9 {
    public static void main(String[] args) {
        char[][] arrays = {{'g', 'j'}, {'h', 'k'}, {'i', 'l'}};
        for (char[] xx : arrays) {
            for (char yy : xx) {
                System.out.print(yy);
            }
            System.out.print(" ");
        }

    }
}

/*
 * Output:gj hk il
 */