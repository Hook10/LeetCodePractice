package org.leetcode._31;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = {1,3,2};
    int[] nums2 = {1,2,3};
    int[] nums3 = {3,1,2};

    System.out.println(Arrays.toString(nums));
    nextPermutation(nums);
    System.out.println(Arrays.toString(nums));
    System.out.println("======================");

    System.out.println(Arrays.toString(nums2));
    nextPermutation(nums2);
    System.out.println(Arrays.toString(nums2));
    System.out.println("======================");

    System.out.println(Arrays.toString(nums3));
    nextPermutation(nums3);
    System.out.println(Arrays.toString(nums3));
    System.out.println("======================");
  }

  private static void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }
    if (i >= 0) {
      int j = nums.length - 1;
      while (j >= 0 && nums[j] <= nums[i]) {
        j--;
      }
      swap(nums, i, j);
    }
    reverse(nums, i + 1);
  }

  private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  private static void reverse(int[] nums, int start) {
    int end = nums.length - 1;
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }
  }
}