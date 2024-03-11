package org.leetcode._58;

public class Main {
  public static void main(String[] args) {
    String s = "   fly me   to   the moon  ";
    System.out.println(lengthOfLastWord(s));
  }

  private static int lengthOfLastWord(String s) {
    return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
  }
}
