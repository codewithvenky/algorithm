package com.venky.test;

import java.util.*;

/**
 *  Short digit by its mid number
 *  if mid digit repeated then short them as they appear in input
 *
 *  For Example
 *  Input    23424 23524  56747 23213 25424  34198
 *  Output    24198   23213  23424 25424 23524 56747
 *
 */
public class ShortBasiedonMidDigitofNumber {

    public static void main (String args[])
    {
        int arr[] =  new   int[] {23424,23524 , 56747 ,23213, 25424 ,34198};
        shortInput(arr);
    }

    private static void shortInput(int[] arr) {
        Map<String, List<Integer>> mp = new TreeMap<>();
        for (int e : arr)
        {
            String element=   String.valueOf(e);
            int length = element.length();
            String midElement =  String.valueOf(element.charAt(length/2));
            if(mp.containsKey(midElement))
            {
              List<Integer> i = mp.get(midElement);
              i.add(e);
            }
            else
            {
                List <Integer> l = new ArrayList();
                l.add(e);
                mp.put(midElement,l);
            }

        }

        for (Map.Entry<String,List<Integer>> e :mp.entrySet())
        {
            List <Integer> l = e.getValue();

            for(Integer t : l )
            {
                 System.out.print (t +"    ");
            }
        }

    }
}
