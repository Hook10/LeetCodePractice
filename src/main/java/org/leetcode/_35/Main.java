package org.leetcode._35;

public class Main {
  public static void main(String[] args) {
    System.out.println(searchInsert(new int[] {1,3,5,6}, 5));
    System.out.println(searchInsert(new int[] {1,3,5,6}, 7));
  }

  private static int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int middle = low + (high - low) / 2;
      int value = nums[middle];
      if (value > target) high = middle - 1;
      else if (value < target) low = middle + 1;
      else if (value == target) return middle;
    }
    return low;
  }
}
