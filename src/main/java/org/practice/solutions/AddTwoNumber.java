/**
 * Copyright (c) 2024 All Rights Reserved
 */
package org.practice.solutions;

import java.math.BigInteger;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: AddTwoNumber.java , v 0.1 2024-10-24 22.37 Yosepri Disyandro Berutu Exp $$
 */
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = convertToNum(l1);
        BigInteger num2 = convertToNum(l2);

        BigInteger sum = num1.add(num2);
        ListNode sumListNode = convertToLinkedList(sum);

        return sumListNode;
    }

    public static BigInteger convertToNum(ListNode node) {
        if (node == null) {
            return BigInteger.valueOf(0);
        }

        BigInteger sum = BigInteger.valueOf(0);

        int i = 0;
        while (node != null) {

            BigInteger multiplyResult = new BigInteger(String.valueOf((int)Math.pow(10, i)));
            sum = sum.add(new BigInteger(String.valueOf(node.val)).multiply(multiplyResult));
            i++;

            node = node.next;
        }

        return sum;
    }

    public static ListNode convertToLinkedList(BigInteger num) {
        ListNode node = new ListNode();
        ListNode temp = node;

        while(num.compareTo(BigInteger.valueOf(0)) > 0) {
            BigInteger val = num.remainder(new BigInteger("10"));
            num = num.divide(new BigInteger("10"));

            temp.val = val.intValue();

            if (num.compareTo(new BigInteger("0")) > 0) {
                temp.next = new ListNode();
            }

            temp = temp.next;
        }

        return  node;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }
}
