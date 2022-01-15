package com.venky.java8.functionalterface;

interface Animal {
    public void speak(String words);
}
public class MagicCalculation
{
    public static void main(String[] args) {
        Animal a=(p)-> {System.out.println(p);};
        a.speak("This is venky My Workds ");
        Animal b=(p)-> {System.out.println("I am Jiraf"+p);};
        b.speak("This is venky My Workds ");
    }


}