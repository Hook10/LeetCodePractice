package org.leetcode._226;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return root;
    }
    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);

    root.right = left;
    root.left = right;
    return root;
  }


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

      TreeNode.invertTree(root);


    }
}
