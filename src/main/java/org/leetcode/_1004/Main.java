package org.leetcode._1004;

public class Main {
  public static void main(String[] args) {
    System.out.println(longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
  }

  public static int longestOnes(int[] nums, int k) {
    int result = 0;
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
      result = Math.max(result, i - j + 1);
    }
    return result;
  }

}
