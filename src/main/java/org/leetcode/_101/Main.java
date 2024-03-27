package org.leetcode._101;


public class Main {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode l1 = new TreeNode(2);
    TreeNode r1 = new TreeNode(2);
    TreeNode l2 = new TreeNode(3);
    TreeNode l3 = new TreeNode(4);
    TreeNode r2 = new TreeNode(4);
    TreeNode r3 = new TreeNode(3);

    root.left = l1;
    root.right = r1;

    l1.left = l2;
    l1.right = l3;

    r1.left = r2;
    r1.right = r3;

    /*    root
       l1      r1
      l2 l3   r2 r3
    * */

    System.out.println(TreeNode.isSymmetric(root));

  }
}
