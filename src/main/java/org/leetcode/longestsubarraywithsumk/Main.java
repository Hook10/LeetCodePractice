package org.leetcode.longestsubarraywithsumk;

public class Main {
  public static void main(String[] args) {
    int[] a = {5, 3, 0, 0, 0, 8, 1, 1, 2};
    int[] b = {1, 1, 1, 2, 5};
    System.out.println(getLongestSubArray(a, 8));
    System.out.println(getLongestSubArray(b, 5));
  }

  private static int getLongestSubArray(int[] a, int k) {

    int n = a.length;
    int left = 0;
    int right = 0;
    int maxLength = 0;
    int sum = a[0];

    while (right < n) {
      while (left <= right && sum > k) {
        sum -= a[left];
        left++;
      }

      if (sum == k) maxLength = Math.max(maxLength, right - left + 1);

      right++;
      if (right < n) sum += a[right];
    }
    return maxLength;
  }

}
