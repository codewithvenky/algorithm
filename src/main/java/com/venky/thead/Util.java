package com.venky.thead;


class Exampleo extends Thread
{
static Integer counter = 0;
public void run() {
    incrementCounter();
    printCounter();
}
public void incrementCounter(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
    }
public void printCounter() {
    Util.sop("counter= >>" +counter);
    }

public void process() {
    incrementCounter();
    printCounter();
}
}
public class Util {
    public static void sop(String s)
    {
        System.out.println(String.format("Thread[d) " +s +"<<<<>>>>"+Thread.currentThread().getId()));
}
    public static void main(String[] args){
        Exampleo ex = new Exampleo();
        ex.process();
        ex.process();
        ex.process();
        ex.process();
        ex.process();
    }

}
