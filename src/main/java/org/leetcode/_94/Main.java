package org.leetcode._94;


import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(4);
      TreeNode l1 = new TreeNode(2);
      TreeNode r1 = new TreeNode(7);
      root.left = l1;
      root.right = r1;

      TreeNode l2 = new TreeNode(1);
      TreeNode r2 = new TreeNode(3);
      l1.left = l2;
      l1.right = r2;

      TreeNode l3 = new TreeNode(6);
      TreeNode r3 = new TreeNode(9);
      r1.left = l3;
      r1.right = r3;

      //  4
    //  2    7
    // 1 3  6 9

    Main main = new Main();
    List<Integer> integerList = main.inorderTraversal(root);
    System.out.println(integerList);
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    helper(root, result);
    return result;
  }

  public void helper(TreeNode root, List<Integer> result) {
    if (root != null) {
      helper(root.left, result);
      result.add(root.val);
      helper(root.right, result);
    }
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
