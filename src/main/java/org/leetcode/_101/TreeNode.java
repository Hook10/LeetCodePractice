package org.leetcode._101;

public class TreeNode {
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

  public static boolean isSymmetric(TreeNode root) {
    return isMirrored(root, root);
  }

  private static boolean isMirrored(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;

    return (t1.val == t2.val) && isMirrored(t1.left, t2.right) && isMirrored(t1.right, t2.left);
  }
}
