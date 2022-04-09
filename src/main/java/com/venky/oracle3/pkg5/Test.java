package com.venky.oracle3.pkg5;
@interface Resource {
    String [] value();
}
public class Test {
    @Resource(value="test")
    public void test(){
        System.out.println("test");
    }
    @Resource("test1")
    public void test1(){
        System.out.println("test1");
    }
    @Resource("test2")
    public void test2(){
        System.out.println("test2");
    }
    @Resource(value = "test3")
    public void test3(){
        System.out.println("test3");
        }
    @Resource( {"test4","test5"})
    public void test4(){
        System.out.println("test4");
    }
}
