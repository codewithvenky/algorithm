package com.venky.oracle.pkg18;

public class DNASynth {
    int aCount;
    int tcount;
    int cCount;
    int gCount;
    DNASynth(int a, int tcount, int c, int g) {
        // line 1
        aCount=a;
        setgCount(g);

    }

    public int getaCount() {
        return aCount;
    }

    public void setaCount(int aCount) {
        this.aCount = aCount;
    }

    public int getTcount() {
        return tcount;
    }

    public void setTcount(int tcount) {
        this.tcount = tcount;
    }

    public int getcCount() {
        return cCount;
    }

    public void setcCount(int cCount) {
        this.cCount = cCount;
    }

    public int getgCount() {
        return gCount;
    }

    public void setgCount(int gCount) {
        this.gCount = gCount;
    }

    public static void main(String[] args) {

        DNASynth dnaSynth = new DNASynth(1,2,3,4);
        System.out.println(dnaSynth.getaCount());
        System.out.println(dnaSynth.getTcount());
        System.out.println(dnaSynth.getcCount());
        System.out.println(dnaSynth.getgCount());
    }
}

/*
Solution is B & C
 */