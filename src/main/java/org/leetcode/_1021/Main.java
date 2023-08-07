package org.leetcode._1021;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    System.out.println(removeOuterParentheses("(()())(())"));
    System.out.println(removeOuterParentheses("(()())(())(()(()))"));
  }

  private static String removeOuterParentheses(String s) {
    Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        if (!stack.isEmpty()) {
          sb.append(s.charAt(i));
        }
        stack.push(s.charAt(i));
      } else {
        stack.pop();
        if (!stack.isEmpty()) {
          sb.append(s.charAt(i));
        }
      }
    }
    return sb.toString();
  }
}
