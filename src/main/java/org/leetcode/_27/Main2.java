package org.leetcode._27;

public class Main2 {
  public static void main(String[] args) {
    System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
  }

  private static int removeElement(int[] nums, int val) {
    int j = nums.length - 1;
    int i = 0;
    int count = 0;
    while (count < nums.length) {
      count++;
      if (nums[j] != val) {
        if (nums[i] == val) {
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
        i++;
      }else {
        j--;
      }
    }
    return i;
  }
}
