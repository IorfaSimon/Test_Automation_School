package com.OneWeekCodingChallenge;
import java.util.Arrays;
class Task3findMaximumProduct {
    public static void find_max_product(int[] nums)
    {
        int max_pair_product = Integer.MIN_VALUE;
        int max_i = -1, max_j = -1;

        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (max_pair_product < nums[i] * nums[j])
                {
                    max_pair_product = nums[i] * nums[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.print("Pair is (" + nums[max_i] + ", " + nums[max_j] + "), Maximum Product: " + (nums[max_i]*nums[max_j]));
    }

    public static void main (String[] args)
    {
        int[] nums = { 2, 3, 5, 6, -7, 5, 9, -5 };
        System.out.println("\nOriginal array: "+Arrays.toString(nums));
        find_max_product(nums);
    }
}

