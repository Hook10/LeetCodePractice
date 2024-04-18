package org.leetcode._1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 1, 1, 3};
    System.out.println(uniqueOccurrences(arr));

    int[] arr2 = {1, 2};
    System.out.println(uniqueOccurrences(arr2));
  }

  public static boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    int mapKeys = map.keySet().size();
    Set<Integer> collect = new HashSet<>(map.values());
    return mapKeys == collect.size();
  }

}

