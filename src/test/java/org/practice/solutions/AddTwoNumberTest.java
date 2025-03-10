/**
 * Copyright (c) 2024 All Rights Reserved
 */
package org.practice.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: AddTwoNumberTest.java , v 0.1 2024-10-24 22.47 Yosepri Disyandro Berutu Exp $$
 */
public class AddTwoNumberTest {

    @Test
    public void convertToNum_GreaterThan0() {
        ListNode listNode = new ListNode(1, new ListNode(5, new ListNode(2)));
        BigInteger num = AddTwoNumber.convertToNum(listNode);

        Assertions.assertEquals(new BigInteger("251"), num);
    }

    @Test
    public void convertToLinkedList_NotNull() {
        BigInteger num = new BigInteger("251");

        ListNode listNode = AddTwoNumber.convertToLinkedList(num);
        Assertions.assertEquals(1, listNode.val);
        Assertions.assertEquals(5, listNode.next.val);
        Assertions.assertEquals(2, listNode.next.next.val);
        Assertions.assertNull(listNode.next.next.next);

    }

    @Test
    public void test(){
        int arr[] = {1,2,3};

    }

}
