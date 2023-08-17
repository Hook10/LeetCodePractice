package org.leetcode._13;

public class Main {
  public static void main(String[] args) {
    System.out.println(romanToInt("III"));
    System.out.println(romanToInt("MCMXCIV"));
  }

  private static int romanToInt(String s) {
    int answer = 0;
    int num = 0;
    int prev = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      switch (s.charAt(i)) {
        case 'I' -> num = 1;
        case 'V' -> num = 5;
        case 'X' -> num = 10;
        case 'L' -> num = 50;
        case 'C' -> num = 100;
        case 'D' -> num = 500;
        case 'M' -> num = 1000;
      }
      if (num < prev) answer -= num;
      else answer += num;
      prev = num;
    }
    return answer;
  }
}
