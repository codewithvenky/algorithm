package com.venky.dp;

import java.util.Arrays;
import java.util.List;

public class Main
{
    // Function to find the length of the longest decreasing subsequence
    // of subarray `nums[i…n)`
    public static int LDS(int[] nums, int i, int prev)
    {
        // Base case: nothing is remaining
        if (i == nums.length) {
            return 0;
        }

        // case 1: exclude the current element and process the
        // remaining elements
        int excl = LDS(nums, i + 1, prev);

        // case 2: include the current element if it is smaller
        // than the previous element in LDS
        int incl = 0;
        if (nums[i] < prev) {
            incl = 1 + LDS(nums, i + 1, nums[i]);
        }

        // return the maximum of the above two choices
        return Integer.max(incl, excl);
    }

    public static void main(String[] args)
    {
        List<Integer> integers = Arrays.asList(1, 32, 4, 2, 4, 2, 42);
       // integers.stream().fl
    }
}
