package org.leetcode._1903;

public class Main {
  public static void main(String[] args) {
    System.out.println(largestOddNumber("52"));
    System.out.println(largestOddNumber("4206"));
    System.out.println(largestOddNumber("35427"));
  }

  private static String largestOddNumber(String num) {
    for (int i = num.length() - 1; i >= 0; i--) {
      if (num.charAt(i) % 2 == 1) return num.substring(0, i + 1);
    }
    return "";
  }
}
