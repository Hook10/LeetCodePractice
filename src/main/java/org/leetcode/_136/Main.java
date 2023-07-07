package org.leetcode._136;


public class Main {
  public static void main(String[] args) {
    System.out.println(singleNumber(new int[]{1, 2, 2, 4, 4}));
    System.out.println(singleNumber(new int[]{1, 2, 2, 4, 4, 1, 3}));
  }

  private static int singleNumber(int[] nums) {
    int result = 0;
    for (int i : nums) {
      result ^= i;
    }
    return result;
  }
}
