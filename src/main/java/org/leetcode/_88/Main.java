package org.leetcode._88;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    merge(nums1, 3, new int[]{2,5,6}, 3);
    System.out.println(Arrays.toString(nums1));

    int[] nums3 = {1};
    merge(nums3, 1, new int[] {}, 0);
    System.out.println(Arrays.toString(nums3));

  }

  private static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int j = 0, i = m; j < n; j++) {
      nums1[i] = nums2[j];
      i++;
    }
    Arrays.sort(nums1);
  }
}
