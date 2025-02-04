package org.leetcode._303;

public class NumArray {
  int[] nums;
  int[] prefix;

  public NumArray(int[] nums) {
    this.nums = nums;
    this.prefix = new int[nums.length];
    int current = 0;
    for (int i = 0; i < nums.length; i++) {
      current += nums[i];
      prefix[i] = current;
    }
  }

  public int sumRange(int left, int right) {
    if (left > 0) {
      return prefix[right] - prefix[left - 1];
    } else {
      return prefix[right];
    }
  }

  public static void main(String[] args) {
    NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
    System.out.println(numArray.sumRange(0, 2));
    System.out.println(numArray.sumRange(2, 5));
    System.out.println(numArray.sumRange(0, 5));
  }
}
