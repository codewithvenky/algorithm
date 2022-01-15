package com.venky.java8.methodref;
interface Sayable{
    void say();
}
public class MerhodReference01 {
    public  void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method

        MerhodReference01 test = new MerhodReference01();
        Sayable sayable = test::saySomething;
        // Calling interface method
        sayable.say();
    }
}