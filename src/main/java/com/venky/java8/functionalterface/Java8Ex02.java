package com.venky.java8.functionalterface;
@FunctionalInterface
interface Calculations
{
    public int performCalculations(int a, int b);
}
public class Java8Ex02 {
    public static void main (String agrs[])
    {
        Calculations s = (a, b) -> a+b;
        int sum =s.performCalculations(5,5);
        System.out.println("Sum is "+sum);
        s= (a, b) -> a-b;
        int min = s.performCalculations(5,5);
        System.out.println("Minus is "+min);
        s= (a, b) -> a*b;
        int mul =s.performCalculations(5,5);
        System.out.println("Multiply is "+mul);
    }
}
