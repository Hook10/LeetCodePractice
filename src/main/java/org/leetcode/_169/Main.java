package org.leetcode._169;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    int[] nums = {2,2,1,1,1,2,2};
    int[] nums2 = {2,2,1,1,1,2,2,1,1,1};
    System.out.println(majorityElement(nums));
    System.out.println(majorityElement(nums2));


  }

  private static int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    int max = Integer.MIN_VALUE;
    int maxKey = -1;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (max < entry.getValue()) {
        max = entry.getValue();
        maxKey = entry.getKey();
      }
    }
    return maxKey;
  }

}
