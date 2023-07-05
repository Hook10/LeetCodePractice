package org.leetcode._485;

public class Main {
  public static void main(String[] args) {
    int[] nums1 = {1, 1, 0, 1, 1, 1};
    int[] nums2 = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0};
    System.out.println(findMaxConsecutiveOnes(nums1));
    System.out.println(findMaxConsecutiveOnes(nums2));
  }

  private static int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int count = 0;
    for (int num : nums) {
      if (num == 1) {
        count += 1;
        max = Math.max(max, count);
      } else {
        count = 0;
      }
    }
    return max;
  }
}
