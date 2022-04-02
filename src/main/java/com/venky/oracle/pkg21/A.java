package com.venky.oracle.pkg21;

public   class A {

    int a = 0;
    int b = 0;
    int c = 0;

    public    void foo(int i) {
        a += b * i;
        c -= b * i;
    }
  public void setB ( int i){
            b = i;
        }
    }

    /*
    option B make Foo and setB synchronized
     */