package org.leetcode._18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
    int target = 9;
    System.out.println(fourSum(nums, target));
  }

  public static List<List<Integer>> fourSum(int[] nums, int target) {
    int n = nums.length;
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < n; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) continue;
      for (int j = i + 1; j < n; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) continue;
        int low = j + 1;
        int high = n - 1;
        while (low < high) {
          long sum = nums[i];
          sum += nums[j];
          sum += nums[low];
          sum += nums[high];
          if (sum == target) {
            ans.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
            low++;
            high--;

            while (low < high && nums[low] == nums[low - 1]) low++;
            while (low < high && nums[high] == nums[high + 1]) high--;
          } else if(sum < target) low++;
          else high--;
        }
      }
    }
    return ans;
  }
}