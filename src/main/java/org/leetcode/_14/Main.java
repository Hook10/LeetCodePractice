package org.leetcode._14;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
  }

  private static String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String s1 = strs[0];
    String s2 = strs[strs.length - 1];
    int i = 0;
    while (i < s1.length() && i < s2.length()) {
      if (s1.charAt(i) != s2.charAt(i)) break;
      else i++;
    }
    return s1.substring(0, i);
  }
}
