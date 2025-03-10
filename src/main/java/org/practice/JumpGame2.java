/**
 * Dana.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package org.practice;

import java.util.*;

/**
 * @author Yosepri Disyandro Berutu (yosepri.disyandro@dana.id)
 * @version $Id: JumpGame2.java , v 0.1 2025-03-09 08.34 Yosepri Disyandro Berutu Exp $$
 */
public class JumpGame2 {

    public static void main(String[] args) {
        int arr[] = {2,3,0,1,4,2,3,0,1,4};
        int minJump = jump(arr);
//        System.out.println(minJump);
    }
    public static int jump(int[] nums) {
        int startPosition = 0;
        int counter = 0;

        int memo[] = new int[nums.length];
        Arrays.fill(memo, -1);

        calculateJump(nums, startPosition, counter, memo);
        for (int i=0; i< memo.length; i++) {
//            System.out.printf("[%d]: %d\n", i, memo[i]);
        }

        return memo[0];
    }

    public static int calculateJump(int[] nums, int position, int ct, int[] memo) {

        if (position >= nums.length - 1) {
            return ct;
        }

        if (memo[position] != -1) {
            return memo[position];
        }

        // get the number of current index
        int num = nums[position];

        int minimumJump = Integer.MAX_VALUE;

        for (int i=1; i<=num; i++) {
            int result = calculateJump(nums, position + i, ct + 1, memo);
            minimumJump = Math.min(result, minimumJump);
        }

        System.out.printf("[insert memo][%d]: %d\n", position, minimumJump);
        memo[position] = minimumJump;

        return minimumJump;
    }
}
