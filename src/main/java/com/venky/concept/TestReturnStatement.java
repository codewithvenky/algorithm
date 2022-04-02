package com.venky.concept;

public class TestReturnStatement
{
    public static void main(String[] args) {
       
        String myString=  testingReturnStament();
        System.out.println(myString);
    }

    private static String testingReturnStament() {
        try {
            System.out.println("AAAAAAAAAA");

            return "try";
        }catch (Exception e)
        {   System.out.println("BBBBBBBBB");
            return "catch";

        }
        finally {
            System.out.println("DDDDDDD");
            return "finally";

        }
    }
}
