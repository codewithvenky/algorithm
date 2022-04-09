package com.venky.oracle4.pkg2;

import java.util.stream.IntStream;

public class Test2 {
    public static void main(String[] args) {
        var i =1;
        var result = IntStream.generate(() -> i).limit(100).sum();
        System.out.println(result);

        //OPTTION A
       ///  System.out.println(IntStream.range(0,99).count());

        //OPTION B
         //System.out.println(IntStream.rangeClosed(0,100).count());

        // OPTion  C
        // System.out.println(IntStream.rangeClosed(0,100).map(x -> x ).count());

        // OPTION D this is correct
        System.out.println(IntStream.rangeClosed(1,100).count());

    }
}
