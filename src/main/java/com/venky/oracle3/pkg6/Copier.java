package com.venky.oracle3.pkg6;

public interface Copier {
    public default void print(String msg){
        System.out.println("Message from Copier: "+msg);
    }

}