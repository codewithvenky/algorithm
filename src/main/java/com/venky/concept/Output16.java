package com.venky.concept;

public class Output16 {
    public static int fun(int A, int B) {
        if (B == 0)
            return A;
        else
            return fun(B, A % B);

    }
    public static void main(String[] args) {
        int ans = fun(100, 2000);
        System.out.println(ans);
    }
}
