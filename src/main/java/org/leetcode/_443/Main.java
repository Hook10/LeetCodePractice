package org.leetcode._443;

public class Main {
  public static void main(String[] args) {
    char[] chars = new char[]{'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'd'};
    System.out.println(compress(chars));
  }

  private static int compress(char[] chars) {
    int index = 0;
    int i = 0;
    while ( i < chars.length) {
      int j = i;
      while (j < chars.length && chars[j] == chars[i]) {
        j++;
      }
      chars[index++] = chars[i];
      if (j - i > 1) {
        String count = j - i + "";
        for ( char c : count.toCharArray()) {
          chars[index++] = c;
        }
      }
      i = j;
    }
    return index;
  }
}
