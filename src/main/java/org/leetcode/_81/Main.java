package org.leetcode._81;

public class Main {
  public static void main(String[] args) {
    System.out.println(search(new int[] {2,5,6,0,0,1,2}, 0));
    System.out.println(search(new int[] {2,5,6,0,0,1,2}, 3));
  }

  private static boolean search (int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int mid;
    while (left <= right) {
      mid = left + ((right - left) >> 1);
      if (nums[mid] == target) return true;

      if (nums[mid] < nums[right] || nums[mid] < nums[left]) {
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      } else if (nums[mid] > nums[left] || nums[mid] > nums[right]) {
        if (target < nums[mid] && target >= nums[left]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        right--;
      }
    }
    return false;
  }
}
