package org.leetcode._643;

public class Main {
  public static void main(String[] args) {
    System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 3));
  }

  private static double findMaxAverage(int[] nums, int k) {
    double average = 0;

    for (int i = 0; i < k; i++) {
      average += nums[i] / 1.0 / k;
    }

    double maxAverage = average;

    for (int i = 0; i < nums.length - k; i++) {
      int j = i + k;
      average -= nums[i] / 1.0 / k;
      average += nums[j] / 1.0 / k;
      if (average > maxAverage ) {
        maxAverage = average;
      }
    }
    return maxAverage;
  }

}
