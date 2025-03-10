/**
 * Dana.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package org.practice;

/**
 * @author Yosepri Disyandro Berutu (yosepri.disyandro@dana.id)
 * @version $Id: Fibonacci.java , v 0.1 2025-03-08 15.11 Yosepri Disyandro Berutu Exp $$
 */
public class Fibonacci {

    public static void main(String[] args) {
        int arr[] = new int[10];
        int num = arr[3];
        System.out.println(num);
//        for (int i=1; i < 10; i++) {
//            System.out.println(fibonacci(i));
//        }
    }

    /**
     * function to find fibonacci number
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
