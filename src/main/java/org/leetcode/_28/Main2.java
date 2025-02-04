package org.leetcode._28;

public class Main2 {
  public static void main(String[] args) {
    System.out.println(strStr("abc", "c"));
  }
  private static int strStr(String haystack, String needle) {
    if (haystack.equals(needle)) return 0;
    int result = -1;
    int hLength = haystack.length();
    int nLength = needle.length();
    for (int i = 0; i <= hLength - nLength; i++) {
      String substring = haystack.substring(i, i + needle.length());
      if (substring.startsWith(needle)) {
        return i;
      }
    }
    return result;
  }
}
