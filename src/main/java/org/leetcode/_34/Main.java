package org.leetcode._34;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    System.out.println(100 >> 1);
  }

  private static int[] searchRange(int[] nums, int target) {
    int start = firstGreaterEqual(nums, target);
    if (start == nums.length || nums[start] != target) {
      return new int[]{-1, -1};
    }
    return new int[]{start, firstGreaterEqual(nums, target + 1) - 1};
  }

  private static int firstGreaterEqual(int[] nums, int target) {
    int low = 0, high = nums.length;
    while (low < high) {
      int mid = low + ((high - low) /2 );
      //low <= mid < high
      if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}
