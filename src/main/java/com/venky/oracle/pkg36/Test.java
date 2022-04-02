package com.venky.oracle.pkg36;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        try {
            String param1 = "Oracle";
            if (param1.equalsIgnoreCase("oracle")) {
                throw new ExSub(9001, "APPLICATION ERROR-9001", new FileNotFoundException("MyFile.txt"));
            }
            throw new ExSuper(9001, new FileNotFoundException("MyFile.txt")); // Line 1 } catch (ExSuper ex) {

        }catch (ExSuper ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
// Soution for this ==>>>>9001: APPLICATION ERROR-9001-MyFile.txt