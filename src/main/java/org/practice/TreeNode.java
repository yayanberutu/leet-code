/**
 * Dana.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package org.practice;

/**
 * @author Yosepri Disyandro Berutu (yosepri.disyandro@dana.id)
 * @version $Id: TreeNode.java , v 0.1 2025-03-10 10.25 Yosepri Disyandro Berutu Exp $$
 */
public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, };
        TreeNode root = createTree(arr, 0);
    }

    private static TreeNode createTree(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null) {
            return null;
        }

        TreeNode node = new TreeNode(arr[i], null, null);
        node.left = createTree(arr, 2 * i + 1);
        node.right = createTree(arr, 2 * i + 2);

        return node;
    }
}
