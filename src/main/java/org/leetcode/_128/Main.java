package org.leetcode._128;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    int[] arr = {100, 200, 1, 2, 3, 4};
    int longestConsecutive = longestConsecutive(arr);
    System.out.println("The longest consecutive sequence is " + longestConsecutive);
    int[] arr2 = {100, 200, 1, 2, 3, 4, 5, 6};
    int longestConsecutive2 = longestConsecutive(arr2);
    System.out.println("The longest consecutive sequence is " + longestConsecutive2);
  }

  private static int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i : nums) set.add(i);

    int longestLength = 0;
    for (int num : nums) {
      if (!set.contains(num - 1)) {
        int currentNum = num;
        int currentLength = 1;
        while (set.contains(currentNum + 1)) {
          currentNum += 1;
          currentLength += 1;
        }
        longestLength = Math.max(longestLength, currentLength);
      }
    }
    return longestLength;
  }

}
