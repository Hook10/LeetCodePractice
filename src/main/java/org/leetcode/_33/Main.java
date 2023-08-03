package org.leetcode._33;

public class Main {
  public static void main(String[] args) {
    System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    System.out.println(search(new int[]{4,5,6,7,0,1,2}, 3));
  }
  private static int search(int[] nums, int target) {
    if (nums.length == 0) return -1;
    for (int i = 0, j = nums.length - 1; i < nums.length/2 + 1 || j > nums.length/2; i++, j--) {
      if (nums[i] == target) return i;
      else if (nums[j] == target) return j;
    }
    return -1;
  }
}
