package com.example;

/**
 * Created by DeanGuo on 10/23/16.
 *
 * 一个整形数组里除了一个数字之外,其他的数字都出现了两次,找出只出现一次的数字
 *
 * 思路:任何一个数字异或它自己都等于0
 */

public class 数组中只出现一次的数字 {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,2,6,6,4,3};
        int result = getSingleNum(nums);
        System.out.println(result);
    }

    private static int getSingleNum(int[] nums) {
        int result = 0;
        for (int i=0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

}
