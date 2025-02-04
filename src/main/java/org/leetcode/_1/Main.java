package org.leetcode._1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int[] nums2 = {2, 11, 15, 1, 2, 5};
    int target = 9;
    int target2 = 7;
    int[] ints = twoSum(nums, target);
    int[] ints2 = twoSum(nums2, target2);
    System.out.println(Arrays.toString(ints));
    System.out.println(Arrays.toString(ints2));

    System.out.println("Hello".hashCode());
  }

  private static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        result[1] = i;
        result[0] = map.get(target - nums[i]);
        return result;
      } else {
        map.put(nums[i], i);
      }
    }
    return result;
  }
}
