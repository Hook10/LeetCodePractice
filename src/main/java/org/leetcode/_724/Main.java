package org.leetcode._724;

public class Main {
  public static void main(String[] args) {
    System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
    System.out.println(pivotIndex(new int[] {1,2,3}));
  }

  private static int pivotIndex(int[] nums) {
    if (nums.length == 0) return -1;

    int leftSum = 0;
    int rightSum = 0;

    for (int i : nums) {
      rightSum += i;
    }

    for (int i = 0; i < nums.length; i++ ) {
      rightSum -= nums[i];
      if (rightSum == leftSum) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;
  }

}
