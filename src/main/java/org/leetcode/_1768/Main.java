package org.leetcode._1768;

public class Main {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        String s = mergeAlternately(word1, word2);
        System.out.println(s);
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        int length = Math.max(word1Array.length, word2Array.length);
        for (int i = 0; i < length; i++ ) {
            if (i < word1Array.length && word1Array[i] != '\0' ) {
                sb.append(word1Array[i]);
            }
            if (i < word2Array.length && word2Array[i] != '\0'  ) {
                sb.append(word2Array[i]);
            }
        }
        return sb.toString();
    }
}