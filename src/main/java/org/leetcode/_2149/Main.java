package org.leetcode._2149;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(rearrangeArray(new int[] {3,1,-2,-5,2,-4})));
    System.out.println(Arrays.toString(rearrangeArray(new int[] {-1,1})));
  }

  private static int[] rearrangeArray(int[] nums) {
    int[] result = new int[nums.length];
    int posIdx = 0;
    int negIdx = 1;

    for (int num : nums) {
      if (num < 0) {
        result[negIdx] = num;
        negIdx += 2;
      } else {
        result[posIdx] = num;
        posIdx += 2;
      }
    }
    return result;
  }

}
