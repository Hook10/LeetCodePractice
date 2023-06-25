package org.leetcode._11;

public class Main {
  public static void main(String[] args) {
    int maxArea = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    System.out.println(maxArea);
  }

  private static int maxArea(int[] height) {
    int pointer1 = 0;
    int pointer2 = height.length - 1;
    int maxArea = 0;
    while (pointer1 < pointer2) {
      if (height[pointer1] < height[pointer2]) {
        maxArea = Math.max(maxArea, height[pointer1] * ( pointer2 - pointer1));
        pointer1 += 1;
      } else {
        maxArea = Math.max(maxArea, height[pointer2] * (pointer2 - pointer1));
        pointer2 -= 1;
      }
    }
    return maxArea;
  }

}
