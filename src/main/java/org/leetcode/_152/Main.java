package org.leetcode._152;

public class Main {
  public static void main(String[] args)  {
    System.out.println(maxProduct(new int[] {2,3, -2, 4}));
    System.out.println(maxProduct(new int[] {-2, 0, -1}));
  }

  private static int maxProduct(int[] nums) {
    int max = nums[0], min = nums[0], ans = nums[0];
    int n = nums.length;

    for (int i = 1; i < n; i++) {
      if (nums[i] < 0) {
        int temp = max;
        max = min;
        min = temp;
      }
      max = Math.max(nums[i], max * nums[i]);
      min = Math.min(nums[i], min * nums[i]);
      ans = Math.max(ans, max);
    }
    return ans;
  }
}
