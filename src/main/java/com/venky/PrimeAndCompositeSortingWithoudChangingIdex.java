package com.venky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Prime and Composite
 * You are given a list of N numbers, each of which is either prime or composite. You have to sort the
 * list such that prime and composite numbers are sorted in the ascending and
 * descending order respectively. The final list must contain N sorted numbers according to the given
 * condition and the prime numbers must be located on the indices same as the indices of prime
 * numbers in the initially provided list.
 * Note:
 * • A prime number is the one which has only 2 factors which are 1 and the number itself.
 * • We have considered 1 as prime in this problem.
 * Input format
 * • First line: N (length of the list to be sorted)
 * • Next line: N space-separated numbers
 * Output format
 * Print the list after sorting as per the given condition. The elements of the list should be spaceseparated.
 * Constraints
 * 1<N<106
 * 1 ≤ q ≤ 106
 * <p>
 * <p>
 * Sample input 1
 * 6
 * 549826
 * Sample output 1
 * 298654
 */

public class PrimeAndCompositeSortingWithoudChangingIdex {

    public static void main(String[] args) {

        int[] data = {5, 4, 9, 8, 2, 6};

        int result[] = peformOperation(6, data);


        System.out.println(Arrays.toString(result));

    }

    private static int[] peformOperation(int N, int[] data) {
        System.out.println(Arrays.toString(data));
        int result[] = new int[N];
        List<Integer> primeIndex = new <Integer>ArrayList();
        List<Integer> primeList = new ArrayList<Integer>();
        List<Integer> compositeList = new ArrayList<Integer>();
        List<Integer> compositIndex = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            boolean isPrime = isPrime(data[i]);

            if (isPrime) {
                primeIndex.add(i);
                primeList.add(data[i]);
            } else {
                compositeList.add(data[i]);
                compositIndex.add(i);
            }

        }
        Collections.sort(primeList);
        Collections.sort(compositeList,Collections.reverseOrder());

        for (int i =0; i <primeIndex.size();i++)
        {
            result[primeIndex.get(i)]=primeList.get(i);
        }
        for(int i =0; i <compositIndex.size();i++)
        {
            result[compositIndex.get(i)] = compositeList.get(i);
        }
        return result;
    }

    private static boolean isPrime(int num) {
        boolean status = true;
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= num / 2 + 1; i++) {
            if (num % i == 0) {
                status = false;
                break;
            }

        }
        return status;
    }

}
