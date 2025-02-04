package org.leetcode._448;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
  }

  private static List<Integer> findDisappearedNumbers(int[] nums) {
    boolean[] arr = new boolean[nums.length + 1];

    for(int i : nums) {
      arr[i] = true;
    }
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= nums.length; i++) {
      if (!arr[i]) {
        list.add(i);
      }
    }
    return list;
  }
}
