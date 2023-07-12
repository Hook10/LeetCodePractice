package org.leetcode._121;

public class Main {
  public static void main(String[] args) {
    System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    System.out.println(maxProfit(new int[] {7,6,4,3,1}));
  }

  private static int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int price : prices) {
      if (price < min) {
        min = price;
      } else if (maxProfit < price - min) {
        maxProfit = price - min;
      }
    }
    return maxProfit;
  }
}
