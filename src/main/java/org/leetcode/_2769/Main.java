package org.leetcode._2769;

public class Main {
  public static void main(String[] args) {
    System.out.println(theMaximumAchievableX(4, 1));
    System.out.println(theMaximumAchievableX(3, 2));
  }

  private static int theMaximumAchievableX(int num, int t) {
    // x - t = num + t => x = num + t + t;
    return num + 2 * t;
  }
}
