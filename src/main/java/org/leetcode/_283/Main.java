package org.leetcode._283;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void moveZeroes(int[] nums) {
    int pos = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        if (i != pos) {
          nums[pos] = nums[i];
          nums[i] = 0;
        }
        pos++;
      }
    }
  }

}
