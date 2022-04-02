package com.venky.oracle.pkg39;

import java.text.NumberFormat;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        double currency=1_00.00;
        //Option A

        //NumberFormat formater= NumberFormat.getInstance(locale);

        //Option C
      //  NumberFormat formater= NumberFormat.getInstance(locale).getCurrency();
        //Option D
       NumberFormat formater=NumberFormat.getCurrencyInstance(locale);

        System.out.println(formater.format(currency));
    }
}


// Option D ius currect