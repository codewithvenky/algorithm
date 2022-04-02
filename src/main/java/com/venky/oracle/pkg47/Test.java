package com.venky.oracle.pkg47;

//Question 47

enum Test {
    A, B, C;
    static String getFirstLetter(){ return A.toString();}
    public static void main(String[] args) {
        System.out.println(Test.getFirstLetter());
    }
}

//Answer:


//    O A) final String getFirstLetter() { return A.toString(); }
//        OB) String getFirstLetter() { return A.toString(); }
//    OC) static String getFirstLetter() { return Alphabet.values() [1].toString():
//        OD) static String getFirstLetter(){ return A.toString();}  //Answer
//