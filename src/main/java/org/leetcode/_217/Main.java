package org.leetcode._217;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    System.out.println(containsDuplicates(new int[]{3,3}));
  }
  private static boolean containsDuplicates(int[] nums) {
    if (nums.length == 1) return false;
    if (nums.length == 2) {
      return nums[0] == nums[1];
    }
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) return true;
      set.add(nums[i]);

    }
    return false;
  }
}
