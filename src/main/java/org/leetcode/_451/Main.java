package org.leetcode._451;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) {
    System.out.println(frequencySort("tree"));
    System.out.println(frequencySort("cccaaa"));
    System.out.println(frequencySort("Aabb"));
  }

  private static String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (Character c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    PriorityQueue<Character> priorityQueue = new PriorityQueue<>((c1, c2) -> (map.get(c2) - map.get(c1)));
    priorityQueue.addAll(map.keySet());

    StringBuilder result = new StringBuilder();
    while (!priorityQueue.isEmpty()) {
      char c = priorityQueue.poll();
      int frequency = map.get(c);
      for (int i = 0; i < frequency; i++) {
        result.append(c);
      }
    }
    return result.toString();
  }
}
