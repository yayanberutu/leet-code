/**
 * Copyright (c) 2024 All Rights Reserved
 */
package org.practice.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: TreeNodeTest.java , v 0.1 2024-10-24 19.54 Yosepri Disyandro Berutu Exp $$
 */
public class TreeNodeTest {

    @Test
    public void driver_ConstructTreeNullNodes() {
        TreeNode tree = Driver.constructTree(null);
        Assertions.assertNull(tree);
    }

    @Test
    public void driver_ConstructTreeEmptyNodes(){
        Integer[] nodes = new Integer[]{};

        TreeNode tree = Driver.constructTree(nodes);
        Assertions.assertNull(tree);
    }

    @Test
    public void driver_ConstructTreeOneNodes(){
        Integer[] nodes = new Integer[]{1};

        TreeNode treeNode = Driver.constructTree(nodes);
        Assertions.assertNotNull(treeNode);
        Assertions.assertEquals(1, treeNode.val);
    }

    @Test
    public void driver_ConstructTreeTwoLevelRightNull(){
        Integer[] nodes = new Integer[]{1,2};

        TreeNode treeNode = Driver.constructTree(nodes);

        Assertions.assertEquals(1, treeNode.val);
        Assertions.assertNotNull(treeNode.left);
        Assertions.assertEquals(2, treeNode.left.val);
        Assertions.assertNull(treeNode.right);
    }

    @Test
    public void driver_ConstructTreeTwoLevelNotNull(){
        Integer[] nodes = new Integer[]{1,2,3};

        TreeNode treeNode = Driver.constructTree(nodes);

        Assertions.assertEquals(1, treeNode.val);

        Assertions.assertNotNull(treeNode.left);
        Assertions.assertEquals(2, treeNode.left.val);

        Assertions.assertNotNull(treeNode.right);
        Assertions.assertEquals(3, treeNode.right.val);
    }

    @Test
    public void driver_ConstructTreeMoreThan2Level(){
        Integer[] nodes = new Integer[]{1,2,3,4,5,6,7};

        TreeNode treeNode = Driver.constructTree(nodes);

        Assertions.assertEquals(1, treeNode.val);

        Assertions.assertNotNull(treeNode.left);
        Assertions.assertEquals(2, treeNode.left.val);

        Assertions.assertNotNull(treeNode.right);
        Assertions.assertEquals(3, treeNode.right.val);

        Assertions.assertNotNull(treeNode.left.left);
        Assertions.assertEquals(4, treeNode.left.left.val);

        Assertions.assertNotNull(treeNode.left.right);
        Assertions.assertEquals(5, treeNode.left.right.val);

        Assertions.assertNotNull(treeNode.right.left);
        Assertions.assertEquals(6, treeNode.right.left.val);

        Assertions.assertNotNull(treeNode.right.right);
        Assertions.assertEquals(7, treeNode.right.right.val);
    }


    @Test
    public void driver_ConstructTreeMoreThan2LevelWith1NullNode(){
        Integer[] nodes = new Integer[]{1,2,3,4,null,6,7};

        TreeNode treeNode = Driver.constructTree(nodes);

        Assertions.assertEquals(1, treeNode.val);

        Assertions.assertNotNull(treeNode.left);
        Assertions.assertEquals(2, treeNode.left.val);

        Assertions.assertNotNull(treeNode.right);
        Assertions.assertEquals(3, treeNode.right.val);

        Assertions.assertNotNull(treeNode.left.left);
        Assertions.assertEquals(4, treeNode.left.left.val);

        Assertions.assertNull(treeNode.left.right);

        Assertions.assertNotNull(treeNode.right.left);
        Assertions.assertEquals(6, treeNode.right.left.val);

        Assertions.assertNotNull(treeNode.right.right);
        Assertions.assertEquals(7, treeNode.right.right.val);
    }
}
