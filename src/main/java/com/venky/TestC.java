package com.venky;

import java.util.Arrays;
import java.util.Optional;

public class TestC {

    public static void main(String[] args) {
        int arr[] ={7,8,9,10,1,2,5,6,3,4,10};
        int K=11;
        int i=0;
        int l = arr.length-1;

        while(i < l)
        {
           // System.out.println(i+"-"+l);
             int sum = arr[i] +arr[l];
            if (sum ==K )
            {
                System.out.println("PAIR FOUND =>"+ arr[i] +":"+arr[l] );
                i++;
                l--;
            }
            if (sum > K)
            {
                l--;
            }
            if (sum<K)
            {
                i++;

            }


        }


    }
    
}
