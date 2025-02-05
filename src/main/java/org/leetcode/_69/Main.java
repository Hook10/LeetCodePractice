package org.leetcode._69;

public class Main {
  public static void main(String[] args) {
    System.out.println(mySqrt(16));
  }

  private static int mySqrt(int x) {
    if (x == 0 || x == 1) return x;

    int start = 1;
    int end = x;
    int mid = -1;

    while (start <= end) {
      mid = start + (end - start) / 2;
      if ((long)mid * (long)mid > x)
        end = mid - 1;
      else if (mid * mid == x)
        return mid;
      else start = mid + 1;
    }
    return Math.round(end);
  }
}
