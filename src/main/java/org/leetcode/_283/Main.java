package org.leetcode._283;

public class Main {
  public static void main(String[] args) {
    moveZeroes(new int[]{0, 1, 0, 3, 12});
  }

  public static void moveZeroes(int[] nums) {
    int pos = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        if (i != pos) {
          nums[pos] = nums[i];
          nums[i] = 0;
          pos++;
        }
      }
    }
  }

}
