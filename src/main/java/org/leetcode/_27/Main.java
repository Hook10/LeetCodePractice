package org.leetcode._27;

public class Main {
  public static void main(String[] args) {
    int[] nums = {3, 2, 2, 3};
    int val = 3;
    System.out.println(removeElement(nums, val));

  }

  private static int removeElement(int[] nums, int val) {
    int pos = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[pos] = nums[i];
        pos++;
      }
    }
    return pos;
  }
}
