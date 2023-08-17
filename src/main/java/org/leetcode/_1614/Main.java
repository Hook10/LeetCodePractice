package org.leetcode._1614;

public class Main {
  public static void main(String[] args) {
    System.out.println(maxDepth("(1+(2*3)+((8)/4))+1")); // should return 3
    System.out.println(maxDepth("(1)+((2))+(((3)))"));  // should return 3
  }

  private static int maxDepth(String s) {
    char[] array = s.toCharArray();
    int max = 0;
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == '(') {
        count++;
        max = Math.max(max, count);
      } else if (array[i] == ')') {
        count--;
      }
    }
    return max;
  }
}
