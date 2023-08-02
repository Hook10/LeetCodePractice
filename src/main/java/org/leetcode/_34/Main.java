package org.leetcode._34;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));

  }

  private static int[] searchRange(int[] A, int target) {
    int start = firstGreaterEqual(A, target);
    if (start == A.length || A[start] != target) {
      return new int[]{-1, -1};
    }
    return new int[]{start, firstGreaterEqual(A, target + 1) - 1};
  }

  private static int firstGreaterEqual(int[] A, int target) {
    int low = 0, high = A.length;
    while (low < high) {
      int mid = low + ((high - low) >> 1);
      //low <= mid < high
      if (A[mid] < target) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}
