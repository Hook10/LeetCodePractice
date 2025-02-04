package org.leetcode._26;

import java.util.Arrays;

public class MainTest {
  public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(removeDuplicates(nums));
  }

  private static int removeDuplicates(int[] nums) {
    int[] array = Arrays.stream(nums).distinct().toArray();
    return array.length;
  }
}
