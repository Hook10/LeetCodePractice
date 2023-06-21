package org.leetcode._238;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    int[] ints = main.productExceptItself(new int[]{1, 2, 3, 4});
    System.out.println(Arrays.toString(ints));
  }

  private int[] productExceptItself(int[] nums) {
    int[] result = new int[nums.length];

    for (int i = 0, temp = 1; i < nums.length; i++) {
      result[i] = temp;
      temp *= nums[i];
    }

    for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
      result[i] *= temp;
      temp *= nums[i];
    }
    return result;
  }
}
