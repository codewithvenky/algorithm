package com.venky.twodarray;
import java.util.*;

public class FindDuplicates {

        public static void main(String[] args) {
            int[][] a = new int[9][9];
            Random ran = new Random();
            System.out.println("Printing the main array :-");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    int value = ran.nextInt(100);
                    a[i][j] = value;
                    System.out.print(a[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("");
            System.out.println("Printing the updated array :-");

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i][j] % 2 == 0) {
                      //  System.out.print(a[i][j] + " ");
                    } else if (a[i][j] % 2 != 0) {
                        a[i][j] = 0;
                       // System.out.print(a[i][j] + " ");

                    }
                }
         //       System.out.println(" ");

            }
            System.out.println("");
            System.out.println("printing in Array format :-");
            System.out.println(Arrays.deepToString(a).replace("],", "]\n").replace(", 0", ", 00"));
            System.out.println("***********************************************");
            int totlaRepetedNo =0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    int val = a[i][j];
                    if(val!=0){   int repeated = findRepeated(val, a);
                    if (repeated > 1) {
                        System.out.println(val + "->>" + repeated);
                        totlaRepetedNo++;
                    }
                }
                }

            }

            System.out.println("**************Total Repated No************");
            System.out.println(totlaRepetedNo);

        }

    private static int findRepeated(int val, int[][] a) {
        int coutner=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j]==val)
                {
                    coutner++;
                    a[i][j]=0;
                }
            }
          //  System.out.println(" ");
        }
 return  coutner;
    }
}
