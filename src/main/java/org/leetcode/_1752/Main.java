package org.leetcode._1752;

public class Main {
  public static void main(String[] args) {
    System.out.println(check(new int[] {3,4,5,1,2}));
    System.out.println(check(new int[] {2,1,3,4}));
  }

  private static boolean check(int[] nums) {
    int irreg = 0;
    int length = nums.length;

    for (int i = 0; i < length; i++) {
      int current = nums[i];
      int pivoted = nums[(i + 1) % length];
      if (current > pivoted) {
        irreg +=1;
        if (irreg >= 2) return false;
      }
    }
    return true;
  }
}
