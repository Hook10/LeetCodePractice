package org.leetcode._1456;

public class Main {
  public static void main(String[] args) {
    System.out.println(maxVowels("abciiidef", 3));
    System.out.println(maxVowels("aeiou", 2));
  }

  public static int maxVowels(String s, int k) {
    int current = 0;
    for (int i = 0; i < k; i++) {
      if (isVowel(s.charAt(i))) {
        current++;
      }
    }
    int max = current;

    for (int i = 0; i < s.length() - k; i++) {
      int j = i + k;
      if (isVowel(s.charAt(j))) {
        current ++;
      }
      if (isVowel(s.charAt(i))) {
        current--;
      }
      if (current > max) {
        max = current;
      }
    }
    return max;
  }

  private static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }

}
