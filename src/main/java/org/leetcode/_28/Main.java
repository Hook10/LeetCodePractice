package org.leetcode._28;

public class Main {
  public static void main(String[] args) {
    String str = "abc";
    String a = "c";
    int i = strStr(str, a);
    System.out.println(i);
  }

  private static int strStr(String haystack, String needle) {
    int begin = 0;
    int n = needle.length() - 1;
    if (haystack.equals(needle)) return 0;
    for (int i = 0; i < haystack.length() - n; i++) {
      if (needle.charAt(begin) == haystack.charAt(i) && needle.charAt(n) == haystack.charAt(i + n)) {
        String substring = haystack.substring(i, i + n + 1);
        if (substring.equals(needle)) {
          return i;
        }
      }
    }
    return -1;
  }
}
