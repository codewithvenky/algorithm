package com.venky;

public class Fibonacci {

 public  static void  main (String str[])
 {
      pritnFibbonacci (10);
 }
// assumptoin i > 2
    private static void pritnFibbonacci(int i) {
   int n1=0;
   int n2=1;

   System.out.print(n1 +","+ n2);
   for (int j =2;j<i-2; j++)
   {
      int n3 = n1 +n2;
       System.out.print( "," + n3);
       n1 =n2;
       n2=n3;

   }


    }

}
