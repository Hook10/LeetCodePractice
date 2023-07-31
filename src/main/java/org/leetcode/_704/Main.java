package org.leetcode._704;

public class Main {
  public static void main(String[] args) {
    System.out.println(binarySearch(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    System.out.println(binarySearch(new int[] {-1, 0, 3, 5, 9, 12}, 2));
  }

  private static int binarySearch(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int middle = low + (high - low) / 2;
      int value = nums[middle];
      if (value > target) high = middle - 1;
      else if (value < target) low = middle + 1;
      else return middle;
    }
    return -1;
  }

}
