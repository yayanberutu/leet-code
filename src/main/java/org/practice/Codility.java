/**
 * Dana.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package org.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yosepri Disyandro Berutu (yosepri.disyandro@dana.id)
 * @version $Id: Codility.java , v 0.1 2025-03-07 21.59 Yosepri Disyandro Berutu Exp $$
 */
public class Codility {

    public static void main(String[] args) {
        int arr[] = {1,3,6,4,1,2};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {

        // Implement your solution here
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A)  {
            map.put(a, 1);
        }

        int i = 1;
        while (true) {
            if (!map.containsKey(i)) {
                return i;
            }

            i++;
        }
    }
}
