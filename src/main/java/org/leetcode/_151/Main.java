package org.leetcode._151;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] words = s.split(" ");

        String[] array = Arrays.stream(words).filter(w -> !w.isEmpty())
                .toArray(String[]::new);

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            String temp = array[left].trim();
            array[left] = array[right].trim();
            array[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", array);
    }

    // using stack
    private static String reverseWordsUsingStack(String s ) {
        Stack<String> stack = new Stack<>();
        for (String str : s.trim().split(" ")){
            if (!str.isEmpty()) {
                stack.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
