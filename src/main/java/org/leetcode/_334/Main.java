package org.leetcode._334;

public class Main {
  public static void main(String[] args) {
    System.out.println(increasingTriplet(new int[] {1,2,3,4,5}));
  }

  private static boolean increasingTriplet(int[] nums) {
    if (nums.length < 3) return false;
    int max1 = Integer.MAX_VALUE;
    int max2 = Integer.MAX_VALUE;
    for (int n : nums) {
      if (n <= max1) max1 = n;
      else if(n <= max2) max2 = n;
      else return true;
    }
    return false;
  }

}
