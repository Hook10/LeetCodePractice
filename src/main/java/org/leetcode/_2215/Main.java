package org.leetcode._2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    System.out.println(findDifference(new int[] {1,2,3}, new int[] {2,4,6}));
    System.out.println(findDifference(new int[] {1,2,3,3}, new int[] {1,1,2,2}));
  }

  private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for (Integer num : nums1) set1.add(num);
    for (Integer num : nums2) set2.add(num);

    List<List<Integer>> answer = new ArrayList<>();
    answer.add(new ArrayList<>());
    answer.add(new ArrayList<>());

    for (int n : set1) {
      if (!set2.contains(n)) {
        answer.get(0).add(n);
      }
    }

    for (int n : set2) {
      if (!set1.contains(n)) {
        answer.get(1).add(n);
      }
    }
    return answer;
  }
}
