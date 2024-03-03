package org.leetcode._1929;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums1 = {1,2,1};
    int[] nums2 = {1,3,2,1};
    System.out.println(Arrays.toString(getConcatenation(nums1)));
    System.out.println(Arrays.toString(getConcatenation(nums2)));
  }

  private static int[] getConcatenation(int[] nums) {
    if (nums.length == 0) return nums;
    int n = nums.length;
    int[] ans = new int[n * 2];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[i];
      ans[i + n] = nums[i];
    }
    return ans;
  }
}
