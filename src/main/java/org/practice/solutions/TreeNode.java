/**
 * Copyright (c) 2024 All Rights Reserved
 */
package org.practice.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: TreeNode.java , v 0.1 2024-10-24 16.49 Yosepri Disyandro Berutu Exp $$
 */
public class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(Integer val) {
        this.val = val;
    }

    public TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Driver {

    public static void main(String[] args) {

        Integer[] nodes = new Integer[]{1,2,3,4,5,6,7,8,9,0};

        TreeNode treeNode = constructTree(nodes);
        // printPreOrder(treeNode);
        // printPostOrder(treeNode);
        printLevelOrder(treeNode);
    }

    private static void printPreOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        System.out.println(treeNode.val);
        printPreOrder(treeNode.left);
        printPreOrder(treeNode.right                                                                                                                                                                                );
    }

    private static void printPostOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        printPostOrder(treeNode.left);
        printPostOrder(treeNode.right);
        System.out.println(treeNode.val);
    }

    private static void printInOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        printInOrder(treeNode.left);
        System.out.println(treeNode.val);
        printInOrder(treeNode.right);
    }

    private static void printLevelOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        System.out.println(treeNode.val);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        while (!queue.isEmpty()) {
            TreeNode processedTree = queue.peek();
            if (processedTree.left != null) {
                System.out.println(processedTree.left.val);
                queue.add(processedTree.left);
            }
            if (processedTree.right != null) {
                System.out.println(processedTree.right.val);
                queue.add(processedTree.right);
            }

            queue.poll();
        }
    }

    public static TreeNode constructTree(Integer[] nodes) {
        if (nodes == null) {
            return null;
        }

        if (nodes.length == 0) {
            return null;
        }

        TreeNode treeNode = new TreeNode();
        treeNode.val = nodes[0];

        // [1,2,3,4,5,6,7]
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        for (int i=1; i<nodes.length; i+=2) {

            // got the most inner tree
            TreeNode processedTree = queue.peek();

            Integer left = nodes[i];
            Integer right = i == (nodes.length-1)? null : nodes[i+1];

            // assign
            insertLeftRightNode(processedTree, queue, left, right);

            // poll
            queue.poll();
        }

        return treeNode;
    }

    private static void insertLeftRightNode(TreeNode processTree,
                                            Queue<TreeNode> queue,
                                            Integer left, Integer right){
        if (left != null) {
            processTree.left = new TreeNode(left);
            queue.add(processTree.left);
        }

        if (right != null) {
            processTree.right = new TreeNode(right);
            queue.add(processTree.right);
        }

    }

    private static void assignLeftRightNode(Integer[] nodes, TreeNode processedTree, int i, Queue<TreeNode> queue) {
        if (processedTree.left == null) {

            // assign to processedTree
            TreeNode leftNode = new TreeNode(nodes[i]);
            processedTree.left = leftNode;

            // put into queue
            queue.add(leftNode);
        } else if (processedTree.right == null) {

            // assigned to processedTree
            TreeNode rightNode = new TreeNode(nodes[i]);
            processedTree.right = rightNode;

            // put into queue
            queue.add(rightNode);
        }
    }
}
