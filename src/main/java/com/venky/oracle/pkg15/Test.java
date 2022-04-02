package com.venky.oracle.pkg15;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {
                al.remove(2);
                System.out.print(itr.next());
            }
        }
    }
}

/*
Exception in thread "main" java.util.ConcurrentModificationException

 */