package com.venky.java8.defaultmethods;

// A simple Java program to demonstrate multiple
// inheritance through default methods.
interface TestInterface1
{
    // default method
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2 extends  TestInterface1
{
    // Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}

// Implementation class code
class TestClass01 implements TestInterface2
{
  // Overriding default show method
  /*  public void show()
    {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface1.super.show();

        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface2.super.show();
    }*/

    public static void main(String args[])
    {
        TestClass01 d = new TestClass01();
        d.show();

    }
}
