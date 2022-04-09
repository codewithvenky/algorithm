package com.venky.oracle4.pkg1;

public class Test1 {
    private int sum;

    public int compute() {
        int x = 0;
        while (x < 3) {
            sum += ++x;
        }
        return sum / 4;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        int sum = t.compute();
        sum = t.compute();
        t.compute();
        System.out.println(sum);
    }
}