package org.leetcode._229;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 1, 1, 3};
    System.out.println(majorityElement(nums));

  }

  private static List<Integer> majorityElement(int[] nums) {
    int count1 = 0;
    int count2 = 0;

    Integer candidate1 = null;
    Integer candidate2 = null;

    for (int n : nums) {
      if (candidate1 != null && candidate1 == n) {
        count1++;
      } else if (candidate2 != null && candidate2 == n) {
        count2++;
      } else if (count1 == 0) {
        candidate1 = n;
        count1++;
      } else if (count2 == 0) {
        candidate2 = n;
        count2++;
      } else {
        count1--;
        count2--;
      }
    }

    List<Integer> result = new ArrayList<>();
    count1 = 0;
    count2 = 0;

    for (int n : nums) {
      if (candidate1 != null && candidate1 == n) {
        count1++;
      }
      if (candidate2 != null && candidate2 == n) {
        count2++;
      }
    }
    int p = nums.length;
    if (count1 > p / 3) result.add(candidate1);
    if (count2 > p / 3) result.add(candidate2);
    return result;
  }

}
