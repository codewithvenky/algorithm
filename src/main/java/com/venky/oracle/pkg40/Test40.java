package com.venky.oracle.pkg40;

import java.util.List;
import java.util.function.UnaryOperator;

public class Test40 {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       // UnaryOperator< Integer > u = i -> i * 2;
      UnaryOperator < Integer > u = ( i) -> (i * 2);
      //  UnaryOperator < Integer > u = (int i) -> i * 2;
      //UnaryOperator < Integer > u = i -> { return i*2};
        //   UnaryOperator < Integer > u = var i -> { return i * 2;};
        list.replaceAll(u);
      //  System.out.println(list);

    }
}




//        A) UnaryOperator < Integer > u = (var i) -> (i * 2);    ANSWER
//        B) UnaryOperator < Integer > u = (int i) -> i * 2;
//        C) UnaryOperator < Integer > u = i -> { return i.2};
//        D) UnaryOperator < Integer > u = var i -> { return i * 2;};