package org.leetcode._189;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    rotateArray(nums, 3);
    rotateArray(nums2, 5);

    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums2));
  }

  // 123456789  have given this array
  // 987654321 first step reverse whole array
  // 789 654321 reverse part by k
  // 789 123456 reverse part after k
  private static void rotateArray(int[] nums, int k) {
    k = k % nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);

  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
