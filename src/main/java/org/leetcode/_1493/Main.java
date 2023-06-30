package org.leetcode._1493;

public class Main {
  public static void main(String[] args) {
    System.out.println(longestSubArray(new int[] {1,1,0,1}));
    System.out.println(longestSubArray(new int[] {0,1,1,1,0,1,1,0,1}));
  }

  private static int longestSubArray(int[] nums) {
    int result = 0;
    int k = 1;
    for (int i = 0, j = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        k--;
      }
      while (k < 0) {
        if (nums[j] == 0) {
          k++;
        }
        j++;
      }
      result = Math.max(result, i - j);
    }
    return result;
  }

}
