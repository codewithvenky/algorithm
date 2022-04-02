package com.venky.oracle.pkg28;

public class Test {
    public void process(byte v)
    {
        System.out.println("Byte value " + v);
    }
    public void process(short v) {
        System.out.println("Short value " + v);
    }
/*    public void process(int v) {
        System.out.println("int  value " + v);
    }*/
    public void process(Object v) {
        System.out.println("Object value " + v);
    }
    public static void main (String[]args){
        byte x = 12;
        short y = 13;
    //    new Test().process(x ); // line 1
      //.  new Test().process(y );
        new Test().process(x + y);
    }
}
// Object value 25