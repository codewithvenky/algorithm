package com.venky.oracle.pkg4;



import java.util.ArrayList;
import java.util.Arrays;

public class NewMain {
    public static void main(String[] args) {

        String [] castsName = {"abyssinan", "oxicat", "korant", "laperm", "bengal", "shynz"};
        var cats = new ArrayList<>(Arrays.asList(castsName));
        cats.sort((var a,var b) -> a.compareTo(b));
        cats.forEach(System.out:: println);



    }
}
/*

OUT PUT
abyssinan
bengal
korant
laperm
oxicat
shynz
 */