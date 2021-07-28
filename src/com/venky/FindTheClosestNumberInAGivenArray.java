package com.venky;

/*
Find closest value to the given number, from the given array.
Given an array of sorted integers and find the closest value to the given number. The array may contain duplicate values and negative numbers.

Example : Array : 2,5,6,7,8,8,9 Target number : 5 Output : 5

Target number : 11 Output : 9

Target Number : 4 Output : 5


Ideal Answer (5 star)
1. Takes care of all the scenarios like:
Target is smaller than the first number
Target is greater than the last number.
2. Using the binary search kind approach(half-interval search) to find the closest element.

Guidelines for 4 star rating
Uses binary search algo, but misses some extreme conditions

Guidelines for 3 star rating
Loop traversal algo
 */
public class FindTheClosestNumberInAGivenArray {

    public  static void main (String args [])
    {
        int data[] =   {2,5,6,7,8,8,9};
        int target =11;

     int result =    findClosestvalue(data,target);
     System.out.println(result);
    }

    private static int findClosestvalue(int[] data, int target) {

        int diffValue =Integer.MAX_VALUE;
        int  closetValue= Integer.MAX_VALUE;
        for (int i=0; i < data.length; i++)
        {
         int num = data[i];
         int localDiff = Math.abs(num -target);

         if (localDiff<diffValue) {
             diffValue=localDiff;
             closetValue =num;
         }
         }

        return  closetValue;

    }
}
