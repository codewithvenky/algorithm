package com.venky.oracle.pkg33;
interface Print
{}
public class Test {
    public static void main(String[] args) {
      //  private Print print = com.service.Prov.routingrules.print.Print.getInstance();
        java.util.ServiceLoader<Print> loader = java.util.ServiceLoader.load(Print.class);
        System.out.println(loader);
    }
}


//Optoin D
//Confusion with opiotn A as well becaue if it talks about the implementation of the interface
