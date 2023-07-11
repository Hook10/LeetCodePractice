package org.leetcode._75;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = {2, 0, 2, 1, 1, 0};
    int[] nums2 = {2, 0, 2, 1, 1, 0, 1, 0};
    sortColors(nums);
    sortColors(nums2);
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums2));

  }

  private static void sortColors(int[] nums) {
    boolean isSorted = false;
    while (!isSorted) {
      isSorted = true;
      int ptr = 0;
      while (ptr < nums.length - 1) {
        if (nums[ptr] > nums[ptr + 1]) {
          int temp = nums[ptr + 1];
          nums[ptr + 1] = nums[ptr];
          nums[ptr] = temp;
          isSorted = false;
        }
        ptr++;
      }
    }
  }
}
