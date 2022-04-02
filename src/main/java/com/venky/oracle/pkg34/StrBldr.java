package com.venky.oracle.pkg34;

public class StrBldr {
    static StringBuilder sbl = new StringBuilder ("yo");
    StringBuilder sb2 = new StringBuilder ("hi ");

    public static void main(String[] args) {
        sbl = sbl.append(new StrBldr().foo (new StringBuilder ("hey")));
        System.out.println(sbl);
    }
    StringBuilder foo(StringBuilder s){
        System.out.print(s + " oh " + sb2);
        return new StringBuilder("ey");
    }
}

//hey oh hi yoey

// Solution optin  C is correct with out put hey oh hi yoey