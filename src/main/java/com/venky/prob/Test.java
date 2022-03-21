package com.venky.prob;

import java.util.ArrayList;
import java.util.List;
public class Test {


    public static void main(String[] args) {
        Boolean status=false;
        int N=4;
        List<Integer> list = listOfAllPossibleNumber(N);
        System.out.println(list);

        for (int i =0; i<list.size();i++)
        {
            if(i==0) {
                 status = possibleWithList(list, N);
                if(status)
                    break;
            }
            else
            {
                list.remove(0);
                 status = possibleWithList(list, N);
                if(status)
                    break;
            }

        }
        if(!status)
        {
            System.out.println("K is not possible to achive");
        }




    }

    private static boolean possibleWithList(List<Integer> list,int N) {
        int k=0;
        boolean possible = false;
        int num=0;
        List<String> message= new ArrayList<>();
        for (Integer i : list)
        {
            if(k<=N && i<=N)
            {
                if(k+i<=N) {
                    k = k + i;

                    message.add(i+">>>K"+k);
                    num++;
                    if (k==N)
                    {
                        possible=true;

                        break;
                    }
                }

            }

        }
        if(possible)
        {
            System.out.println("possible using opration"+num);
            System.out.println(message);
        }

        return possible;

    }

    private static List<Integer> listOfAllPossibleNumber(int N ){
        List<Integer> possibleNumber = new ArrayList<>();

       while (N>=0)
        {

            if (N%2==0)
            {
                // check is it power of 2
                boolean powerOfTwo= isPowerOfTwo(N);
               if(powerOfTwo) possibleNumber.add(N);

            }
            else
            {
                // check is it power 3
                boolean powerOfThree= isPowerOfThree(N);
                if(powerOfThree) possibleNumber.add(N);

            }
            N--;
        }
            return  possibleNumber;
    }

    private static boolean isPowerOfThree(int n) {
        if (n<2)
        {
            return false;
        }
        while (n>=3)
        {
            if(n%3!=0)
            {
                return false;
            }
            n=n/3;
        }
        return true;
    }

    private static boolean isPowerOfTwo(int n) {
        if (n<2)
        {
            return false;
        }
        while (n>=2)
        {
            if(n%2!=0)
            {
                return false;
            }
            n=n/2;
        }
        return true;
    }
}