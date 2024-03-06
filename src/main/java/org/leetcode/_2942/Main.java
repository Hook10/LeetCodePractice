package org.leetcode._2942;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String[] arr = {"lt", "code"};
    System.out.println(findWordsContaining(arr, 'e'));

  }

  public static List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> ans = new ArrayList<>(words.length);
    for (int i = 0; i < words.length; i++) {
      if (words[i].contains(String.valueOf(x))) {
        ans.add(i);
      }
    }
    return ans;
  }
}

