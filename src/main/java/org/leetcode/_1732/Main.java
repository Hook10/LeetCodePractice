package org.leetcode._1732;

public class Main {
  public static void main(String[] args) {
    System.out.println(largestAltitude(new int[] {-5,1,5,0,-7}));
    System.out.println(largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));
  }

  private static int largestAltitude(int[] gain) {
    int max = 0;
    int current = 0;
    for (int j : gain) {
      current += j;
      max = Math.max(max, current);
    }
    return max;
  }

}
