package org.leetcode._796;

public class Main {
  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));
    System.out.println(rotateString("bcdea", "abced"));
  }

  private static boolean rotateString(String s, String goal) {
    return s.length() == goal.length() && (s + s).contains(goal);
  }
}
