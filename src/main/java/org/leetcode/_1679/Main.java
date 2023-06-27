package org.leetcode._1679;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println(maxOperations( new int[]{3,1,3,4,3}, 6));
    System.out.println(maxOperations( new int[]{3,1,3,4,3,4,2}, 4));
  }

  private static int maxOperations(int[] nums, int k) {
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    int count = 0;
    while (left < right) {
      int sum = nums[left] + nums[right];
      if (sum == k) {
        left++;
        right--;
        count++;
      } else if (sum > k) {
        right--;
      } else {
        left++;
      }
    }
    return count;
  }

}
